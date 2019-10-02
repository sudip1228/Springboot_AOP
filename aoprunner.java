package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import business.Business1;
import business.Business2;


@SpringBootApplication

@ComponentScan("business,aop,data")
public class aoprunner implements CommandLineRunner  {

	@Autowired
	Business1 b1;
	@Autowired
	Business2 b2;
	
	private static Logger log= LoggerFactory.getLogger(aoprunner.class);
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(aoprunner.class, args);
		
		
	}

	public void run(String... args) throws Exception {
		
		log.info(b1.calculatesomething());
		log.info(b2.calculatesomething());
	}


}
