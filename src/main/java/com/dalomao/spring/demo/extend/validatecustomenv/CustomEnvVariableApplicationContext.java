package com.dalomao.spring.demo.extend.validatecustomenv;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

/**
 * 自定义Spring上下文启动类
 * 用于自定义环境变量验证
 */
public class CustomEnvVariableApplicationContext extends AnnotationConfigServletWebServerApplicationContext {
    /**
     * 重写方法
     */
    @Override
    protected void initPropertySources() {
        super.initPropertySources();

        // "app.name"作为启动的时候必须验证的环境变量，若不存在则报错启动失败
        getEnvironment().setRequiredProperties("app.name");
    }
}