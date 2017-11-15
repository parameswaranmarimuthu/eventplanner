package com.yelloweclips.eventplanner.resource;

import com.yelloweclips.eventplanner.service.EventPlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yelloweclips.eventplanner.model.*;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by m655222 on 11/14/2017.
 */

@Component
@Path("/event")
public class EventPlannerResource {

    @Autowired
    private EventPlannerService eventPlannerService;

    @GET
    @Produces("application/json")
    @Path("/user/{username}")
    public List<Event> getEventsForUser(@PathParam("username") String username){
        return this.eventPlannerService.getEventsForUser(username);
    }

    @GET
    @Produces("application/json")
    @Path("/{name}")
    public Event getEvent(@PathParam("name") String name){

        return this.eventPlannerService.findEventByName(name);
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Event create(@RequestBody Event event){

        return this.eventPlannerService.createEvent(event);

    }

    @POST
    @Consumes
    @Produces
    @Path("/signup")
    public User create(@RequestBody User user){
        return this.eventPlannerService.createUser(user);
    }


}
