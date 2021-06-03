package com.dalomao.spring.demo.aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * ServletContextAware标记接口
 */
@Component
public class DirectServletContextAware {
    @Autowired
    private ServletContext servletContext;

}
