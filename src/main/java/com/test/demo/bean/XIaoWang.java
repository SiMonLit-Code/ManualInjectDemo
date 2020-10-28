package com.test.demo.bean;

import com.test.demo.bean.cglib.CglibBeanProxy;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 10:55:00
 * @description :
 */
public class XIaoWang extends BasicTest {
    public static void main(String[] args) {
        ((BasicHello) CglibBeanProxy.getInstance(BasicHello.class)).sayHello(1,"chen");
    }
}
