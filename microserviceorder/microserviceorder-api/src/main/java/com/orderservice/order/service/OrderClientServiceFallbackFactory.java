package com.orderservice.order.service;

import org.springframework.stereotype.Component;

import com.orderservice.order.entity.OrderInfo;

import feign.hystrix.FallbackFactory;

import java.util.HashMap;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月3日下午5:30:13
 *
 *
 */
@Component
public class OrderClientServiceFallbackFactory implements FallbackFactory<OrderClientService>{
	
	@Override
	public OrderClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new OrderClientService() {
			
			@Override
			public String add(OrderInfo orderInfo) {
				return "操作失败";
			}
		};
	}

}
