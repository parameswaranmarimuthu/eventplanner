package com.yelloweclips.eventplanner.service.impl;

import com.mongodb.DBObject;
import com.yelloweclips.eventplanner.datarepository.mongodb.EventRepository;
import com.yelloweclips.eventplanner.datarepository.mongodb.UserRespository;
import com.yelloweclips.eventplanner.model.Event;
import com.yelloweclips.eventplanner.model.User;
import com.yelloweclips.eventplanner.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by m655222 on 11/14/2017.
 */
@Component
public class EventPlannerServiceImpl implements EventPlannerService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRespository userRespository;


    public User createUser(User user){
        return this.userRespository.save(user);
    }

    @Override
    public Event findEventByName(String name) {
        return this.eventRepository.findEventByName(name);

    }

    @Override
    public Event findEventById(Long id) {
        return null;
    }

    @Override
    public Event createEvent(Event event) {
       return this.eventRepository.save(event);

    }

    @Override
    public List<Event> getEventsForUser(String firstname) {
        User user = this.userRespository.findByfirstName(firstname);

        if(user == null){
            return null;
        }
        Query query =  new Query().addCriteria(Criteria.where("participants").all(user));

        //Query query1 =  new Query().addCriteria(Criteria.where("participants.id").is(user.getId()));

        return this.eventRepository.find(query,Event.class);

    }
}
