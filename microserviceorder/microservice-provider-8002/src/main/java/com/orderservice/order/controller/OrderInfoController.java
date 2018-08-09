package com.orderservice.order.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.order.entity.OrderInfo;
import com.orderservice.order.service.OrderInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月2日下午12:16:50
 *
 *
 */
@Slf4j
@RestController
public class OrderInfoController {
	@Autowired
	private OrderInfoService orderInfoService;

	@RequestMapping(value = "order/add", method = RequestMethod.POST)
	public String add(@RequestBody OrderInfo orderInfo) {
		orderInfo.setOrderId("T" + System.currentTimeMillis());
		log.info("开始下单时间：{}", new Date());
		orderInfoService.add(orderInfo);
		log.info("单号：{}", orderInfo.getOrderId());
		return orderInfo.getOrderId();
	}

}