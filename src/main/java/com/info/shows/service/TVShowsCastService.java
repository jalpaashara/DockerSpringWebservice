package com.info.shows.service;

import java.util.List;

import com.info.shows.model.Cast;
import com.info.shows.model.Shows;

public interface TVShowsCastService {

	Shows findShowById(int showId);

	List<Shows> getAllTVShows();

	List<Cast> getAllShowCasts(int showId);

	Cast findShowCastById(int showId, int castId);

}
