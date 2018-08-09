package com.orderservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月3日下午2:21:17
 *
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.orderservice.*"})
@ComponentScan
public class OrderConcumerFeign_App {
	public static void main(String[] args) {
		SpringApplication.run(OrderConcumerFeign_App.class, args);
	}
}
