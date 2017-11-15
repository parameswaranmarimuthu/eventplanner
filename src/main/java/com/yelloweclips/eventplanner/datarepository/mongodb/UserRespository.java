package com.yelloweclips.eventplanner.datarepository.mongodb;

import com.yelloweclips.eventplanner.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by m655222 on 11/15/2017.
 */
public interface UserRespository extends MongoRepository<User, Long>{

    User findById(Long id);

    User findByfirstName(String firstName);

    User findBylastName(String lastName);

    List<User> findAll();

    
}
