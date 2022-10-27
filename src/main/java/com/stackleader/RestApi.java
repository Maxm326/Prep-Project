package com.stackleader;

import com.stackleader.model.JPAModel;
import com.stackleader.service.JPARegistration;

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

    @Inject
    JPARegistration jpaRegistration;

    @GET
    @Path("jdbc-properties")
    @Produces({MediaType.APPLICATION_JSON})
    public List<PrepDto> getPrepInfo() throws SQLException {
        return prepDao.getPrepData();
    }

    @GET
    @Path("jpa-properties")
    @Produces({MediaType.APPLICATION_JSON})
    public List<JPAModel> getPrepResults() {
        return jpaRegistration.findAllPropertiesWithJpql();
    }

    @GET
    @Path("test")
    @Produces({MediaType.APPLICATION_JSON})
    public PrepDto getTestMessage() {
        return prepDao.getTest();
    }
}
