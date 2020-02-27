package com.akshay.location.service;

import java.util.List;

import com.akshay.location.entities.Location;

public interface LocationService {

    public Location saveLocation(Location location);
    public Location updateLocation(Location location); 
    public void deleteLocation(Location location);
    public Location getLocationbyId(int id);
    List<Location> getAllLocation();
}
