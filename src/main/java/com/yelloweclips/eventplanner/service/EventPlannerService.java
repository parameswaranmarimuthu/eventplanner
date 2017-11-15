package com.yelloweclips.eventplanner.service;

import com.yelloweclips.eventplanner.model.*;

public interface EventPlannerService {

    public Event findEventByName(String name);

    public Event findEventById(Long id);

    public Event createEvent(Event event);


}
