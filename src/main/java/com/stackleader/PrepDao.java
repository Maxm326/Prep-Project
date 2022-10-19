package com.stackleader;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class PrepDao {

    @Resource(lookup = "java:jboss/datasources/pmq-dev-db")
    DataSource dataSource;

    //How to do prepared statements on javax.dataSource


    public List<PrepDto> getPrepData() throws SQLException {
        Connection con = null;
        ResultSet resultSet;
        PreparedStatement ps;
        List<PrepDto> properties = new ArrayList<>();
        String sqlQuery = "SELECT name, uuid FROM property";

        try {
            con = dataSource.getConnection("stackleader", "stackleader");
            con.setAutoCommit(false);
            ps = con.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                PrepDto prepDto = new PrepDto(resultSet.getString("uuid"), resultSet.getString("name"));
                properties.add(prepDto);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }

        return properties;
    }

    public PrepDto getTest() {
        return PrepDto.builder()
                .uuid(UUID.randomUUID().toString())
                .name("Test 1 2 3")
                .build();
    }
}
