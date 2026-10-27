package com.ithiema.demo5proxy2;

public class UserServiceImpl implements UserService{
    @Override
    public void login(String loginName,String password) throws Exception{
        if("root".equals(loginName) && "root".equals(password)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        Thread.sleep(1000);
    }
    @Override
    public void deleteUsers() throws Exception{
        System.out.println("成功删除了1万个用户");
        Thread.sleep(1500);
    }
    @Override
    public String[] selectUsers() throws Exception{
        Thread.sleep(500);
        return new String[]{"zhangsan","lisi","wangwu"};
    }


}
