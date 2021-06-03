package com.dalomao.spring.demo.aware;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DirectApplicationContextTest {
	@Autowired
	private DirectApplicationContext directApplicationContext;

	@Test
	void getServiceTest() {
		directApplicationContext.getService();
	}
}
