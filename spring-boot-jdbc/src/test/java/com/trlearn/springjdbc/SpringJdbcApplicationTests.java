package com.trlearn.springjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJdbcApplicationTests {


    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        //org.apache.tomcat.jdbc.pool.DataSource
        System.out.println(dataSource.getClass());
        System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }

}
