package com.orderservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月2日下午3:51:13
 *
 *
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class OrderInfoProvider8003_App {
public static void main(String[] args) {
	SpringApplication.run(OrderInfoProvider8003_App.class, args);
}
}
