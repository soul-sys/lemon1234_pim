package com.lemon1234;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.lemon1234.mapper")
@EnableAsync
public class PimApplication {

	public static void main(String[] args) {
		SpringApplication.run(PimApplication.class, args);
	}
	
	// Elasticsearch 配置
		// https://blog.csdn.net/qingyuan2014/article/details/112402818
	
	// springboot mail 配置
		// https://blog.csdn.net/yimcarson/article/details/84936440
	
	// JWT 拦截器
		// 
}
