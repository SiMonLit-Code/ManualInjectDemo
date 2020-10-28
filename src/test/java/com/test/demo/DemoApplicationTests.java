package com.test.demo;

import com.test.demo.bean.BasicHello;
import com.test.demo.bean.BasicTest;
import com.test.demo.bean.cglib.CglibBeanProxy;
import com.test.demo.bean.interfaces.Say;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
   /* @Resource
    Say say;*/

    @Resource
    BasicTest basicTest;

   /* @Test
    void contextLoads() {
        say.sayBye(1,"chen");
        say.sayHello(2,"zhen");
    }*/

    @Test
    void contextLoads0() {
//        new BasicTest().sayHello(1,"chen");
        basicTest.sayHello(1,"chen");
//        ((BasicHello) CglibBeanProxy.getInstance(BasicHello.class)).sayHello(1,"chen");

    }


}
