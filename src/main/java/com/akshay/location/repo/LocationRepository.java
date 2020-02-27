package com.akshay.location.repo;

import org.springframework.data.repository.CrudRepository;

import com.akshay.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
