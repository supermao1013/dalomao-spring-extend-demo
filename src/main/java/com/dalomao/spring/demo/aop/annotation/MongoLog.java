package com.dalomao.spring.demo.aop.annotation;

import java.lang.annotation.*;

/**
 * MongoDB日志记录注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MongoLog {
    /**
     * 功能描述
     */
    String desc();
}
