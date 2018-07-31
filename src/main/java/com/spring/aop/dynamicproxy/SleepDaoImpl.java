package com.spring.aop.dynamicproxy;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/7/30 下午9:08
 */
public class SleepDaoImpl implements SleepDao {
    @Override
    public void sleep() {
        System.out.println("本大人要睡觉了");
    }
}
