package com.yelloweclips.eventplanner.service.impl;

import com.yelloweclips.eventplanner.model.Event;
import com.yelloweclips.eventplanner.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by m655222 on 11/14/2017.
 */
@Component
public class EventPlannerServiceImpl implements EventPlannerService {

    @Autowired
    private MongoEventRepository mongoEventRepository;


    @Override
    public Event findEventByName(String name) {
        Event event = this.mongoEventRepository.findEventByName(name);

        return event;
    }

    @Override
    public Event findEventById(Long id) {
        return null;
    }

    @Override
    public Event createEvent(Event event) {
        Event value = this.mongoEventRepository.save(event);
        return value;
    }
}
