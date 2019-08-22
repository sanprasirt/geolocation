package com.packt.microservices.geolocation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeoLocationServiceImpl implements GeoLocationService {
	
	@Autowired
	private GeoLocationRepository repository;
	
	@Override
	public GeoLocation create(GeoLocation geolocation) {
		// TODO Auto-generated method stub
		repository.addGeoLocation(geolocation);
		return geolocation;
	}

	@Override
	public List<GeoLocation> findAll() {
		// TODO Auto-generated method stub
		return repository.getGeoLocations();
	}

}
