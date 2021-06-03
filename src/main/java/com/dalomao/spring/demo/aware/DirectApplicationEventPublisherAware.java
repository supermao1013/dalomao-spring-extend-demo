package com.dalomao.spring.demo.aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 直接注入事件发布器
 */
@Component
public class DirectApplicationEventPublisherAware {
    @Autowired
    private ApplicationEventPublisher  publisher;

    /**
     * 发布事件
     */
    public void publishEvent() {
        publisher.publishEvent(new Object());
    }
}
