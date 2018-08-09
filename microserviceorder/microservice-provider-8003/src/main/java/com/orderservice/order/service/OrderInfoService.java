package com.orderservice.order.service;

import com.orderservice.order.entity.OrderInfo;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月2日下午12:07:32
 *
 *
 */
public interface OrderInfoService {
	/*
	 * 新增订单
	 */
	public boolean add(OrderInfo orderInfo);

}
