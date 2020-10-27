package com.test.demo;

import com.test.demo.bean.interfaces.Say;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    Say say;

    @Test
    void contextLoads() {
        say.sayBye(1,"chen");
        say.sayHello(2,"zhen");
    }

}
