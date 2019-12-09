package com.info.shows.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParseException;

import com.info.shows.model.Shows;

public class ReadJSONData {
	public List<Shows> read() throws JsonParseException {
		Logger logger = LoggerFactory.getLogger(getClass());
		// this is the key object to convert JSON to Java
        ObjectMapper mapper = new ObjectMapper();
        List<Shows> showList = new ArrayList<>();
        
        try {
        	File json = new ClassPathResource("data.json").getFile();
        	showList = Arrays.asList(mapper.readValue(json, Shows[].class));
            return showList;
        } catch(JsonParseException ex) {
        	logger.error("JsonParseException", ex);
        } catch (JsonMappingException e) {
        	logger.error("JsonMappingException", e);
		} catch (IOException e) {
			logger.error("IOException", e);
		}
		return showList;
	}
}