package com.trlearn.consumer;

import com.trlearn.consumer.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class DubboConsumerUserApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.hello();
    }

}
