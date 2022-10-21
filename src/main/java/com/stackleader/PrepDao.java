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

    public List<PrepDto> getPrepData() throws SQLException {

        List<PrepDto> properties = new ArrayList<>();
        String sqlQuery = "SELECT name, uuid FROM property";

        try (Connection con = dataSource.getConnection("stackleader", "stackleader");
             PreparedStatement ps = con.prepareStatement(sqlQuery);
             ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                PrepDto prepDto = new PrepDto(resultSet.getString("uuid"), resultSet.getString("name"));
                properties.add(prepDto);
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
