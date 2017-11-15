package com.yelloweclips.eventplanner.service;

import com.yelloweclips.eventplanner.model.*;

import java.util.List;

public interface EventPlannerService {

    Event findEventByName(String name);

    Event findEventById(Long id);

    Event createEvent(Event event);

    List<Event> getEventsForUser(String userName);

    User createUser(User user);


}
