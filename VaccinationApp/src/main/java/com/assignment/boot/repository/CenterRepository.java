package com.assignment.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.boot.model.Center;

@Repository
public interface CenterRepository extends CrudRepository<Center, Integer>{
	
}
