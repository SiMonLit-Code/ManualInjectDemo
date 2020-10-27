package com.test.demo.bean.proxybean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-10-27 15:44:00
 * @description :
 */
public class ProxyBean {
    private static Map<String,Object> methodMap = new HashMap<>();

    public static Object getInstance(Class<?> clazz,Object[] objects){
        getProxyMethod(objects);
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, (proxy, method, args) -> invoke(method,args));
    }

    private static Object invoke(Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(methodMap.get(getMethodKey(method)),args);
    }

    private static void getProxyMethod(Object[] objects){
        //将实现类的所有方法全部存入Map集合中
        for (Object o : objects) {
            for (Method method : o.getClass().getMethods()) {
                methodMap.put(getMethodKey(method),o);
            }
        }
    }

    private static String getMethodKey(Method method){
        return method.getName() + Arrays.stream(method.getParameters())
                .map(x -> x.getName())
                .reduce((x,y) -> x+"_"+y);
    }
}
