package com.yelloweclips.eventplanner.datarepository.mongodb;

import com.yelloweclips.eventplanner.model.Event;
import com.yelloweclips.eventplanner.model.User;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface EventRepository extends MongoRepository<Event, Long> {

    Event findEventByName(String name);

    Event findById(Long id);

    List<Event> findAll();

    List<Event> findByParticipants(User user);

    List<Event> findByOrganizar(User user);

    List<Event> findByParticipants(Query query, java.lang.Class<Event> event);


}
