package com.ithiema.demo4proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static StarService createProxy(Star star) {
        StarService proxy=(StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), star.getClass().getInterfaces(),
                new InvocationHandler() {
                @Override
                    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable {
                    String methodName = method.getName();
                    if("sing".equals(methodName)){
                        System.out.println("准备话筒");
                    }else if("dance".equals(methodName)){
                        System.out.println("准备舞台");
                    }
                    Object result=method.invoke(star,args);
                    return result;
                }
                });
        return proxy;
    }
}
