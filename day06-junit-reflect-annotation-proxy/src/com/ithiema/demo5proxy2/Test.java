package com.ithiema.demo5proxy2;

public class Test {
    public static void main(String[] args) throws Exception {
        UserService proxy=ProxyUtil.createProxy(new UserServiceImpl() );
        proxy.login("liu","123");
        proxy.deleteUsers();
        proxy.selectUsers();
    }
}
