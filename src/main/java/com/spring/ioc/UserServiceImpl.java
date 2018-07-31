package com.spring.ioc;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/7/29 上午10:03
 */
public class UserServiceImpl implements UserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("我的名字是" + name);
    }
}
