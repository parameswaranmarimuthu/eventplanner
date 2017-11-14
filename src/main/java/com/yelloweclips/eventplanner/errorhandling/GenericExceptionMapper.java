package com.yelloweclips.eventplanner.errorhandling;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by m655222 on 11/14/2017.
 */

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable throwable){
        return Response.serverError().entity(throwable.getMessage()).build();
    }

}
