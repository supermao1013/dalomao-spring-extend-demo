package com.dalomao.spring.demo.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 【BeanNameAware】
 * Aware 接口是一个标记接口，表示所有实现该接口的类是会被Spring容器选中，并得到某种通知
 * 用法：通过实现该接口可以获取到该bean对应的名称
 */
@Component
public class MyBeanNameAware implements BeanNameAware {
    private String beanName;

    /**
     * 重写方法，获取容器中该bean的名称
     */
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }
}
