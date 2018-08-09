package com.orderservice.order.dao;

import org.apache.ibatis.annotations.Mapper;

import com.orderservice.order.entity.OrderInfo;

/**
 * @author gaosuwen
 *
 * @creation 2018年8月2日上午11:44:46
 *
 *
 */
@Mapper
public interface OrderInfoDao {
	public boolean addOrderInfo(OrderInfo orderInfo);
}
