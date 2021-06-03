package com.dalomao.spring.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 【ApplicationContextAware】
 * Aware 接口是一个标记接口，表示所有实现该接口的类是会被Spring容器选中，并得到某种通知
 * 调用时刻：bean实例化之后，ApplicationContextAwareProcessor.postProcessBeforeInitialization()，
 * 对继承自ApplicationContextAware的bean进行处理，调用其setApplicationContext
 * 用法：普通bean可以通过实现ApplicationcontextAware接口获得应用上下文
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware {
    private ApplicationContext appContext;

    @Override
    public void setApplicationContext(ApplicationContext appContext) throws BeansException {
        this.appContext = appContext;
    }
}
