package com.test.demo.bean.cglib;

import com.test.demo.bean.BasicHello;
import com.test.demo.bean.cglib.handler.MyMethodInterceptor;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 17:04:00
 * @description :
 * 与JDK代理对比
 * JDK代理要求被代理的类必须实现接口，有很强的局限性。而CGLIB动态代理则没有此类强制性要求。
 * 简单的说，CGLIB会让生成的代理类继承被代理类，并在代理类中对代理方法进行强化处理(前置处理、后置处理等)。但是如果被代理类被final修饰，那么它不可被继承，即不可被代理；
 * 同样，如果被代理类中存在final修饰的方法，那么该方法也不可被代理。
 */
public class CglibBeanProxy {
    public static Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //继承被代理类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(new MyMethodInterceptor());
        //设置代理对象
        return enhancer.create();
    }

    public static void main(String[] args) {
        ((BasicHello) CglibBeanProxy.getInstance(BasicHello.class)).sayHello(1,"chen");
    }
}
