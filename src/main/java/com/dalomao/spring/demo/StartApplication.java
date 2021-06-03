package com.dalomao.spring.demo;

import com.dalomao.spring.demo.extend.validatecustomenv.CustomEnvVariableApplicationContext;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		// 使用默认Context启动
		SpringApplication.run(StartApplication.class, args);

		// 使用自定义Context：CustomEnvVariableApplicationContext启动
//		SpringApplication springApplication = new SpringApplication(StartApplication.class);
//		ApplicationContextFactory factory = ApplicationContextFactory.ofContextClass(CustomEnvVariableApplicationContext.class);
//		springApplication.setApplicationContextFactory(factory);
//		springApplication.run(args);
	}

}
