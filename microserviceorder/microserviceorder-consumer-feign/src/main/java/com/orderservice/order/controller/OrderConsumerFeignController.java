package com.orderservice.order.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.order.entity.OrderInfo;
import com.orderservice.order.service.OrderClientService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月3日下午2:22:56
 *
 *
 */
@Slf4j
@RestController
public class OrderConsumerFeignController {

	@Autowired
	OrderClientService orderClientService;

	@RequestMapping(value = "consumer/order/add", method = RequestMethod.POST)
	public String add(@RequestBody OrderInfo orderInfo) {
		log.info("feign调用开始。。。。。");
		return orderClientService.add(orderInfo);
	}

}
