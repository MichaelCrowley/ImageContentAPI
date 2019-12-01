package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Image;

// This will be AUTO IMPLEMENTED by Spring into a Bean called imageRepository
// CRUD refers Create, Read, Update, Delete

public interface ImageRepository extends CrudRepository<Image, Integer> {

}