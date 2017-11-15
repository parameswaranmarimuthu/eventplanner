package com.yelloweclips.eventplanner.service;

import com.yelloweclips.eventplanner.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface MongoEventRepository extends MongoRepository<Event, Long> {

    Event findEventByName(String name);


}
