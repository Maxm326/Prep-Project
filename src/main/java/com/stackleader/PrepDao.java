package com.stackleader;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.UUID;


public class PrepDao {

    @Resource(lookup = "java:jboss/datasources/pmq-dev-db")
    DataSource dataSource;

    //How to do prepared statements on javax.dataSource


//    public List<PrepDto> getPrepData() {
//        PreparedStatement ps = new PreparedStatement() {}
//    }

    public PrepDto getTest() {
        return PrepDto.builder()
                .uuid(UUID.randomUUID().toString())
                .name("Test 1 2 3")
                .build();
    }
}
