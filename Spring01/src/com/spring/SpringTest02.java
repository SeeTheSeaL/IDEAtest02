package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lee
 * @date 2020/4/20 - 10:03 上午
 */
public class SpringTest02 {
    public static void main(String[] args) {


        //初始化spring容器加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //通过容器获取userService的实例
        UserService userService = (UserService) applicationContext.getBean("userService");
        //调用实例中的say()方法
        userService.Say();

    }
}
