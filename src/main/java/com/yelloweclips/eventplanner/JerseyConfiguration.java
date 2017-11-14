package com.yelloweclips.eventplanner;

import com.yelloweclips.eventplanner.errorhandling.GenericExceptionMapper;
import com.yelloweclips.eventplanner.resource.EventPlannerResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * Created by m655222 on 11/14/2017.
 */
@Configuration
@ApplicationPath("api")
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration(){

    }

    @PostConstruct
    public void setUp(){
        register(EventPlannerResource.class);
        register(GenericExceptionMapper.class);

    }
}
