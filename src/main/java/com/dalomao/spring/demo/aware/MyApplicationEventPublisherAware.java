package com.dalomao.spring.demo.aware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 获得事件发布器
 */
@Component
public class MyApplicationEventPublisherAware implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher  publisher;

    /**
     * 重写方法获取事件发布器
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher appEventPublisher) {
        this.publisher = appEventPublisher;
    }

    /**
     * 发布事件
     */
    public void publishEvent() {
        publisher.publishEvent(new Object());
    }
}
