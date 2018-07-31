package com.spring.aop.dynamicproxy;

import org.junit.After;
import org.junit.Before;

import java.lang.reflect.Proxy;

/**
 * @author kunjie.zhang
 * @description:对于接口一般使用动态代理的方式实现aop
 * @date 2018/7/30 下午9:10
 */
public class Test {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void test() {
        //目标类必须基于统一的接口
        SleepDao s = new SleepDaoImpl();
        ClassLoader classLoader = s.getClass().getClassLoader();
        MyInvoctionHandler myInvoctionHandler = new MyInvoctionHandler(s);
        //Proxy为InvocationHandler实现类动态创建一个符合某一接口的代理实例
        SleepDao sd = (SleepDao) Proxy.newProxyInstance(classLoader, s.getClass().getInterfaces(), myInvoctionHandler);

        //相当于调用代理角色的Invoke()
        sd.sleep();
    }
}
