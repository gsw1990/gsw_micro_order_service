package com.orderservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author gaosuwen
 *
 * @creation 2018年8月3日上午11:10:54
 *
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway_Order_App {
	
		public static void main(String[] args)
		{
			SpringApplication.run(Zuul_Gateway_Order_App.class, args);
		}

}
