package com.test.demo.bean;

import com.test.demo.bean.interfaces.SayHello;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 11:22:00
 * @description :
 */
@RestController
public class BasicHello implements SayHello {
    @Override
    public void sayHello(Integer id, String name){
        System.out.println("Hi! "+name+id);
    }
}
