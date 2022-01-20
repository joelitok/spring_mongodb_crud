package com.dataproject.dataproject.dao;
import com.dataproject.dataproject.model.Module_1;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Module_1Repository extends MongoRepository<Module_1,String> {
    Module_1 findModule_1ById(String module_1);
}
