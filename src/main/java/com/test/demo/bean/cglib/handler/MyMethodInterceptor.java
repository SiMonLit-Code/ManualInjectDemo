package com.test.demo.bean.cglib.handler;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 17:11:00
 * @description : 实现 MethodInterceptor接口生成拦截器方法
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("Before: "+method.getName());
        Object o1 = methodProxy.invokeSuper(o, objects);
//        System.out.println("After: "+method.getName());
        return o1;
    }
}
