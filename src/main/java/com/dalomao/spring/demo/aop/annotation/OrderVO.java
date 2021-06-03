package com.dalomao.spring.demo.aop.annotation;

import lombok.Data;

import java.util.Date;

/**
 * 订单VO实体
 */
@Data
public class OrderVO {
    private Long orderId;

    private String orderNumber;

    private Date orderTime;
}
