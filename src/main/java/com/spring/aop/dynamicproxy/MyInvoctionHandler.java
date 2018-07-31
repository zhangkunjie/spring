package com.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/7/30 下午9:08
 */
public class MyInvoctionHandler implements InvocationHandler {
    private Object object = null;

    public MyInvoctionHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("睡觉前要脱衣服啊");
        Object obj = method.invoke(object, args);
        System.out.println("睡着了当然得做个美梦啊");
        return obj;
    }
}
