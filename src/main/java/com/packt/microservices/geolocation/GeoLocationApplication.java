package com.packt.microservices.geolocation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class GeoLocationApplication {
	public static void main(String[] args) {
		SpringApplication.run(GeoLocationApplication.class, args);
		new Thread(new GeoLocationConsumer()).start();
	}	

}
