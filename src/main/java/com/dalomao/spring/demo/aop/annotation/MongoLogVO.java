package com.dalomao.spring.demo.aop.annotation;

import lombok.Data;

/**
 * Mongo日志实体VO
 */
@Data
public class MongoLogVO {
    /**
     * 状态，S-成功，E-失败
     */
    private String status;

    /**
     * 功能描述
     */
    private String desc;

    /**
     * 被调用的类名
     */
    private String clazz;

    /**
     * 被调用的方法
     */
    private String method;

    /**
     * 耗时，单位毫秒
     */
    private long takeTime;

    /**
     * 请求参数
     */
    private String request;

    /**
     * 返回参数
     */
    private String response;

    /**
     * 异常错误信息
     */
    private String exceptionInfo;
}
