package com.orderservice.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.order.dao.OrderInfoDao;
import com.orderservice.order.entity.OrderInfo;
import com.orderservice.order.service.OrderInfoService;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月2日下午12:10:57
 *
 *
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	@Autowired
	private OrderInfoDao orderDao;

	@Override
	public boolean add(OrderInfo orderInfo) {

		return orderDao.addOrderInfo(orderInfo);

	}

}
