package com.akshay.location.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.location.entities.Location;
import com.akshay.location.repo.LocationRepository;

@Service
public class LocationServiceIMPL  implements LocationService{

	@Autowired
	private LocationRepository locationRepository;
	
	//Setter and Getters
	
	public LocationRepository getLocationRepositort() {
		return locationRepository;
	}

	public void setLocationRepositort(LocationRepository locationRepositort) {
		this.locationRepository = locationRepositort;
	}

	// Overridden methods
	
	@Override
	public Location saveLocation(Location location) {
		
				return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		 locationRepository.delete(location);
	}

	@Override
	public Location getLocationbyId(int id) {
		
		return locationRepository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		
		Iterable<Location> it=locationRepository.findAll();
		List<Location> cltn  = new ArrayList<Location>(); 
		for(Location location:it) {
			cltn.add(location);
		}
		
		
		return cltn;
	}

}
