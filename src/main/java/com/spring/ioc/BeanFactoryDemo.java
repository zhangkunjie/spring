package com.spring.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import sun.jvm.hotspot.HelloWorld;


/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/7/29 上午10:34
 */
public class BeanFactoryDemo {
    @Test
    public void test() {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
        bdr.loadBeanDefinitions(resource);
        UserService userService = (UserService) factory.getBean("userService");
        userService.say();
    }
}
