package com.udacity.doggraphqlapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.udacity.doggraphqlapi.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {}