package com.yelloweclips.eventplanner.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by m655222 on 11/14/2017.
 */

@Component
@Path("/event")
public class EventPlannerResource {

    @GET
    @Produces("application/json")
    public String getEvent(){
        return "Welcome !!!";
    }

}
