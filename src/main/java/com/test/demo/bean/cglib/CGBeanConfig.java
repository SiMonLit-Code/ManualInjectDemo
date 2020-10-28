package com.test.demo.bean.cglib;

import com.test.demo.bean.BasicHello;
import com.test.demo.bean.BasicTest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 17:30:00
 * @description :
 */
@Component
public class CGBeanConfig {

    @Bean
    public BasicTest basicTest(){
        return (BasicTest) CglibBeanProxy.getInstance(BasicTest.class);
    }
}
