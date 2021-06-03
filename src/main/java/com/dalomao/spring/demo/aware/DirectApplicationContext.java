package com.dalomao.spring.demo.aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 直接注入上下文
 */
@Component
public class DirectApplicationContext {
    @Autowired
    private ApplicationContext appContext;

    public void getService() {
        MyApplicationContextAware contextAware = (MyApplicationContextAware)
                appContext.getBean("myApplicationContextAware");
        System.out.println("通过直接注入上下文的方式获取到bean：" + contextAware.getClass());
    }
}
