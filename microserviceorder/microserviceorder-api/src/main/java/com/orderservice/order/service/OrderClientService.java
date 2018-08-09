package com.orderservice.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.orderservice.order.entity.OrderInfo;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月3日下午2:10:29
 *
 *
 */

//@FeignClient(value="MICROSERVICE-ORDER")
@FeignClient(value="MICROSERVICE-ORDER",fallbackFactory=OrderClientServiceFallbackFactory.class)
public interface OrderClientService {
	@RequestMapping(value = "order/add", method = RequestMethod.POST)
	public String add( OrderInfo orderInfo);
}
