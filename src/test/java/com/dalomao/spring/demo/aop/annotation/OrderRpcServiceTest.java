package com.dalomao.spring.demo.aop.annotation;

import com.dalomao.spring.demo.core.vo.PageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class OrderRpcServiceTest {
	@Autowired
	private OrderRpcService orderRpcService;

	@Test
	void addTest() {
		OrderVO orderVO = new OrderVO();
		orderVO.setOrderId(1L);
		orderVO.setOrderNumber("123456");
		orderVO.setOrderTime(new Date());
		orderRpcService.add(orderVO);
	}

    @Test
    void findListTest() {
        OrderQueryVO queryVO = new OrderQueryVO();
        queryVO.setOrderNumber("123456");

        PageVO pageVO = new PageVO();
        pageVO.setPageNum(1);
        pageVO.setPageSize(10);

        orderRpcService.findList(queryVO, pageVO);
    }
}
