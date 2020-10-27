package com.test.demo.bean;

import com.test.demo.bean.interfaces.SayBye;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 11:22:00
 * @description :
 */
@RestController
public class BasicBye implements SayBye {
    @Override
    public void sayBye(Integer id, String name) {
        System.out.println("Bye! "+ name+id);
    }
}
