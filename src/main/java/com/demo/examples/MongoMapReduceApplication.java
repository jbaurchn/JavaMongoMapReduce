package com.demo.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.examples.service.MapReduceService;

@SpringBootApplication
public class MongoMapReduceApplication implements CommandLineRunner {

	@Autowired MapReduceService autoCompleteService;
	
	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(MongoMapReduceApplication.class);
	        app.setBannerMode(Banner.Mode.OFF);
	        app.setWebEnvironment(false);
	        app.run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		autoCompleteService.populateCollection();
	}

}
