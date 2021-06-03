package com.dalomao.spring.demo.aop.annotation;

import com.dalomao.spring.demo.core.vo.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class OrderRpcService {
    @MongoLog(desc = "创建订单")
    public void add(OrderVO orderVO) {
        log.info("创建订单");
    }

    @MongoLog(desc = "分页查询订单")
    public List<OrderVO> findList(OrderQueryVO queryVO, PageVO pageVO) {
        log.info("分页查询订单");

        OrderVO orderVO = new OrderVO();
        orderVO.setOrderId(1L);
        orderVO.setOrderNumber("123456");
        orderVO.setOrderTime(new Date());
        return Arrays.asList(orderVO);
    }
}
