package com.stackleader;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;

@Path("/")
public class RestApi {

    @Inject
    PrepDao prepDao;

    @GET
    @Path("properties")
    @Produces({MediaType.APPLICATION_JSON})
    public List<PrepDto> getPrepInfo() throws SQLException {
        return prepDao.getPrepData();
    }

    @GET
    @Path("test")
    @Produces({MediaType.APPLICATION_JSON})
    public PrepDto getTestMessage() {
        return prepDao.getTest();
    }
}
