package com.spring.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/7/30 下午9:13
 */
public class CglibProxy implements MethodInterceptor {
    public Object getProxy(Object object) {
        Enhancer e = new Enhancer();//创建代理对象类
        e.setSuperclass(object.getClass());//声明代理对象的父类是谁（是目标对象）
        e.setCallback(this);//设置回调函数，即调用intercept()
        return e.create();//返回创建的代理对象
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy arg3) throws Throwable {
        System.out.println("你个大懒猪，竟然睡觉前不脱衣服，嫌弃o");
        Object object = arg3.invokeSuper(proxy, args);
        System.out.println("起床啦，要不然得迟到了哦");
        return null;
    }
}
