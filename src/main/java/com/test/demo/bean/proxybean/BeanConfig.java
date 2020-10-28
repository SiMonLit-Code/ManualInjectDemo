package com.test.demo.bean.proxybean;

import com.test.demo.bean.interfaces.Say;
import com.test.demo.bean.interfaces.SayBye;
import com.test.demo.bean.interfaces.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 15:39:00
 * @description : 手动注入bean
 */
//@Component
public class BeanConfig {
    @Resource
    SayHello sayHello;
    @Resource
    SayBye sayBye;

    @Bean
    public Say getSay(){
        //创建动态代理
        return (Say) ProxyBean.getInstance(Say.class,new Object[]{sayBye,sayHello});
    }
}
