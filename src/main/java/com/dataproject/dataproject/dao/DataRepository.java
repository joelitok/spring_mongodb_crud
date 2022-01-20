package com.dataproject.dataproject.dao;

import com.dataproject.dataproject.model.Data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<Data,String>{
    Data findDataById(String dataid);
}
