package com.spring.aop.cglib;

import org.junit.After;
import org.junit.Before;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/7/30 下午9:15
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
        CglibProxy proxy=new CglibProxy();
        Base base=(Base) proxy.getProxy(new Base());
        base.sleep();
    }
}
