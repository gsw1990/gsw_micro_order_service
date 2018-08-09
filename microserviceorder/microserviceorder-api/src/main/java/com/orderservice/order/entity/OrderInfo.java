package com.orderservice.order.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * @author gaosuwen
 *
 * @creation 2018年8月2日上午10:26:12
 *
 *
 */

@NoArgsConstructor
@Data
@Accessors(chain=true)
public class OrderInfo implements Serializable {
	
	private static final long serialVersionUID = 377630608332472048L;

	private String orderId;//订单号

	private String status;//状态
	
	private String amount; //金额
   
	private Date transTime;//交易日期(YYYY-MM-DD hh:mi:ss)
    
	private Date updateTime; //更新日期(YYYY-MM-DD hh:mi:ss)
	
	private String remark;//备注 
}
