package com.demo.examples.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapreduce.MapReduceOptions;
import org.springframework.stereotype.Component;

import com.demo.examples.model.CustomOutput;

@Component
public class MapReduceService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MapReduceService.class);
	@Autowired MongoOperations operations;
	
	
	public void populateCollection(){
		operations.mapReduce
		(
			 
			 "CustomCollection",
			 "classpath:map.js", 
			 "classpath:reduce.js",
			 new MapReduceOptions()
			 	.finalizeFunction("classpath:finalize.js")
			 	.outputCollection("CustomOutput"),
			 	CustomOutput.class
		);
		LOGGER.info("Successfully executed mapReduce task to populate the Collection");
		
	}
		
		
	
}
