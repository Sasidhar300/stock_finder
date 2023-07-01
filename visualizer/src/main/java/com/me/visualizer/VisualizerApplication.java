package com.me.visualizer;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class VisualizerApplication {

	@Autowired
	StockWrapperRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(VisualizerApplication.class, args);
	}

}
