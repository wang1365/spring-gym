package com.xiaochuan.springgym;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        applicationContext.getEnvironment().setActiveProfiles("dev");
        FirstBean firstBean = applicationContext.getBean(FirstBean.class);
        firstBean.hello();

        applicationContext.close();
    }
}
