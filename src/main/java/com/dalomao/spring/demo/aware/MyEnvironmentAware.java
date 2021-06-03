package com.dalomao.spring.demo.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 【EnvironmentAware】
 * Aware 接口是一个标记接口，表示所有实现该接口的类是会被Spring容器选中，并得到某种通知
 * 用法：普通bean可以通过实现EnvironmentAware接口获得当前应用程序的运行环境对象
 */
@Component
public class MyEnvironmentAware implements EnvironmentAware {
    private Environment environment;

    /**
     * 重写方法，获取环境信息
     */
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
