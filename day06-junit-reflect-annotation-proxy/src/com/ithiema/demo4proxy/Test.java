package com.ithiema.demo4proxy;

public class Test {
    public static void main(String[] args) {
        Star star = new Star("周杰伦");
        StarService proxyUtil =ProxyUtil.createProxy(star);
        proxyUtil.sing("七里香");
        System.out.println(proxyUtil.dance());

    }
}
