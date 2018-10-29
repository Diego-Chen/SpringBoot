package com.air.demo.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@SpringBootApplication// Spring Boot项目的核心注解，主要目的是开启自动配置
@MapperScan("com.air.demo.dao") //指定扫描的mapper接口所在的包  在类上声明MapperScan，这是mybatis-spring-boot-starter在1.1.1引入的类Mapper，从而在mapper接口上不需要任何声明
@Controller
public class Application {
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hellow(){
		return "hello word";
	}
	
	// 在main方法中启动一个应用，即：这个应用的入口
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("SpringBoot Start Success");
    }
	
    

}
