package com.orderservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * @author gaosuwen
 *
 * @creation 2018年8月3日上午9:37:19
 *
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Order_DashBoard_App {
	public static void main(String[] args)
	{
		SpringApplication.run(Order_DashBoard_App.class, args);
	}
}
