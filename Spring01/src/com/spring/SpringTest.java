package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lee
 * @date 2020/4/19 - 4:32 下午
 */
public class SpringTest {
    public static void main(String[] args) {
        //初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //通过容器获取userDao的实例
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        //调用实例方法
        userDao.Say();
    }

}
