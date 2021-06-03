package com.dalomao.spring.demo.core.vo;

import lombok.Data;
import org.springframework.core.annotation.Order;

/**
 * 分页参数VO
 */
@Data
public class PageVO {
    private int pageSize;

    private int pageNum;
}
