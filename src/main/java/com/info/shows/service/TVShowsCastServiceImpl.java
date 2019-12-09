package com.info.shows.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.info.shows.model.Cast;
import com.info.shows.model.Shows;

@Service
public class TVShowsCastServiceImpl implements TVShowsCastService {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public List<Shows> getAllTVShows() {
		ReadJSONData showListData = new ReadJSONData();
		List<Shows> showList = new ArrayList<>();
		try {
			showList = showListData.read();
			logger.info("Show List:");
			logger.info(showList.toString());
			return showList;
		} catch (JsonParseException e) {
			logger.error("JsonParseException", e);
		}
		return showList;
	}
	
	@Override
	public Shows findShowById(int showId) {
		Shows shows = new Shows();
		List<Shows> showList = getAllTVShows();
		try {
			for (Shows s: showList) {
				if (s.getShowId() == showId) {
					return s;
				}
			}
		} catch (NullPointerException e) {
			logger.error("NullPointerException");
			logger.error( "Something's wrong with findAllCustomer()");
		} 
		
		if (shows.getShowId() == 0) {
			logger.warn("Please check customer id. Your provided id is " + showId );
		}
		
		return shows;
	}

	@Override
	public List<Cast> getAllShowCasts(int showId) {
		return findShowById(showId).getCast();
	}

	@Override
	public Cast findShowCastById(int showId, int castId) {
		List<Cast> castList = getAllShowCasts(showId);
		Cast cast = new Cast();
		try {
			if (!castList.isEmpty()) {
				for (Cast c: castList) {
					if (c.getCastId() == castId) {
						return c;
					}
				}
			}
			
			if (cast.getCastId() == 0) {
				logger.warn("Please check order id. Your provided id is " + castId );
			}
			
		} catch(NullPointerException ex) {
			logger.error("NullPointerException");
			logger.error( "Either customer id or order id is not correct.");
		}
		
		return cast;
	}

}
