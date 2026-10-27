package com.ithiema.demo5proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxy(UserService userService) {
        UserService proxy = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                userService.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(userService, args);
                        long end = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法执行时间：" + (end - start) + "毫秒");
                        return result;

                    }


                });

        return proxy;
    }
}
