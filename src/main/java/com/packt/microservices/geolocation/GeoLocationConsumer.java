package com.packt.microservices.geolocation;

import java.util.Properties;

import com.google.gson.Gson;

public class GeoLocationConsumer implements Runnable {
	private static final Gson GSON = new Gson();
	private static final GeoLocationRepository REPO = new GeoLocationRepository();
	
	public void run() {
		Properties props = new Properties();
		
	}
}
