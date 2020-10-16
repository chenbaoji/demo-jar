package com.lanqiao.common;

import java.io.Serializable;

import com.lanqiao.model.order.OdOrder;
/**
 * 订单状态变化消息体.
 * @author 陈宝吉
 *
 * 2020年9月9日
 */
public class NatsNotifyData implements Serializable
{
	int tryCount=0; // 发送次数.
	Long lastTime; // 发送时间. 
	OdOrder order; // 订单内容. 
	String orderSendType; // 通知消息类型, successPay closeOrder refundOrder
	
	public static void main(String[] args)
	{
		NatsNotifyData a = new NatsNotifyData();
		a.setOrder(new OdOrder());
		a.getOrder().setOrderId(new Long(1L));
		NatsNotifyData b = new NatsNotifyData();
		b.setOrder(new OdOrder());
		b.getOrder().setOrderId(new Long(1L));
		System.out.print( a.equals(b));

		
	}

	
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		if(order !=null && order.getOrderId() !=null)
		{
			NatsNotifyData data = (NatsNotifyData)obj;
			return order.getOrderId().equals(data.getOrder().getOrderId());
		}
		return false;
		
	}
	
	
	
	
	public int getTryCount()
	{
		return tryCount;
	}
	public Long getLastTime()
	{
		return lastTime;
	}
	public OdOrder getOrder()
	{
		return order;
	}
	public String getOrderSendType()
	{
		return orderSendType;
	}
	public void setTryCount(int tryCount)
	{
		this.tryCount = tryCount;
	}
	public void setLastTime(Long lastTime)
	{
		this.lastTime = lastTime;
	}
	public void setOrder(OdOrder order)
	{
		this.order = order;
	}
	public void setOrderSendType(String orderSendType)
	{
		this.orderSendType = orderSendType;
	}
	
	
	
}
