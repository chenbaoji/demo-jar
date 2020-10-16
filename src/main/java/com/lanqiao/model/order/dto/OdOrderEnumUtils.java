package com.lanqiao.model.order.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OdOrderEnumUtils {
	
	public enum BocomPaychannel{
		/**
		 * 交行支付通道. 
		 * 	bizContent.setPayChn("0202");  // 微信
			//bizContent.setPayChn("0301"); // 银行
			//bizContent.setPayChn("0201"); // 公众号内支付
		 */
		/**
		 * 未支付.
		 */
		weixin("0202", "微信支付"),
		bankpay("0301", "对公转账"),
		weixin_service("0201", "公众号微信支付"),
		alipay("0900", "支付宝");


		private String value;
		private String text;

		private BocomPaychannel(String value, String text) {
			this.value = value;
			this.text = text;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(String value) {
			if(value == null) 
				return "";
			for (BocomPaychannel c : BocomPaychannel.values()) {
				if (c.getValue().equals( value)) {
					return c.getText();
				}
			}
			return null;
		}
		
		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (BocomPaychannel c : BocomPaychannel.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
	}
	/**
	 * 订单状态.
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月3日
	 */
	public enum OrderStatusEnum{
		/**
		 * 0	未支付
			1	已支付
			2	已提交至第三方支付平台
			3	待审核
			4	审核失败
			5	超时关闭
			6	已退款
			8	退款中
		 */
		/**
		 * 未支付.
		 */
		unPay(0, "未支付"),
		/**
		 * 已支付.
		 */
		paid(1, "已支付"),
		/**
		 * 已提交至第三方支付平台
		 */
		toThird(2, "已提交至第三方支付平台"),
		/**
		 * 待审核(公对公).
		 */
		waitAppro(3, "待审核"),
		/**
		 * 审核失败(公对公).
		 */
		approError(4, "审核失败"),
		/**
		 * 已关闭.
		 */
		overTime(5, "已关闭"),
		/**
		 * 已退款.
		 */
		refunded(6, "已退款"),
		/**
		 * 退款中.
		 */
		refunding(8, "退款中");

		private int value;
		private String text;

		private OrderStatusEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (OrderStatusEnum c : OrderStatusEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}
		public static OrderStatusEnum getByValue(Integer value) {
			if(value == null) 
				return null;
			for (OrderStatusEnum c : OrderStatusEnum.values()) {
				if (c.getValue()== value) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (OrderStatusEnum c : OrderStatusEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (OrderStatusEnum c : OrderStatusEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
	
	/**
	 * 发票内容.
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月3日
	 */
	public enum InvoiceConfigEnum{
		/**
		 *1	报名费
			2	培训费
			3	证书制作费
			4	会议费
			5	考试管理费
		 */
		apply(1, "报名费"),
		train(2, "培训费"),
		cert(3, "证书制作费"),
		meeting(4, "会议费"),
		exam(5, "考试管理费");

		private int value;
		private String text;

		private InvoiceConfigEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}


		public String getText() {
			return text;
		}

		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (InvoiceConfigEnum c : InvoiceConfigEnum.values()) {
				if (c.getValue() ==value) {
					return c.getText();
				}
			}
			return null;
		}

		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (InvoiceConfigEnum c : InvoiceConfigEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (InvoiceConfigEnum c : InvoiceConfigEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
	
	
	/**
	 * 发票内容.
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月3日
	 */
	public enum ManagerTypeEnum{
		/**
		 *1:个人缴费;
		 *2:院校缴费;
		 *3:机构缴费
		 */
		self(1, "个人缴费"),
		college(2, "院校缴费"),
		org(3, "机构缴费");

		private int value;
		private String text;

		private ManagerTypeEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (ManagerTypeEnum c : ManagerTypeEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}

		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (ManagerTypeEnum c : ManagerTypeEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (ManagerTypeEnum c : ManagerTypeEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
	/**
	 * 
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月3日
	 */
	public enum PayPlatformEnum{
		/**
		 *0	未确定
		1	支付宝
		2	对公转账
		3	微信支付
		 */
		unsure(0, "未确定"),
		alipay(1, "支付宝"),
		pubPay(2, "对公转账"),
		weixinPay(3, "微信支付"),

		bocom_alipay(4, "支付宝"),
		bocom_pubPay(5, "对公转账"),
		bocom_weixinPay(6, "微信支付");
		
		private int value;
		private String text;

		private PayPlatformEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (PayPlatformEnum c : PayPlatformEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取.
		 * @param value
		 * @return
		 */
		public static PayPlatformEnum getByValue(Integer value) {
			if(value == null) 
				return null;
			for (PayPlatformEnum c : PayPlatformEnum.values()) {
				if (c.getValue()== value) {
					return c;
				}
			}
			return null;
		}

		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (PayPlatformEnum c : PayPlatformEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (PayPlatformEnum c : PayPlatformEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
	
	/**
	 * 发票状态.
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月3日
	 */
	public enum InvoiceStatusEnum{
		/**
		 * 0: 未申请
		 *1：未开，
		 *2：已开
		 */
		notApp(0, "未申请"),
		notSend(1, "未开"),
		send(2, "已开");

		private int value;
		private String text;

		private InvoiceStatusEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (InvoiceStatusEnum c : InvoiceStatusEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}

		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (InvoiceStatusEnum c : InvoiceStatusEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (InvoiceStatusEnum c : InvoiceStatusEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}	
		public static HashMap toMapValueKey()
		{
			HashMap mp = new HashMap();
			for (InvoiceStatusEnum c : InvoiceStatusEnum.values()) {
				mp.put(c.getText(),c.getValue());
			}
			return mp;
		}	
	}
	
	/**
	 * 订单状态通知类型(仅给业务异步通知时使用).
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月7日
	 */
	public enum OrderSendTypeEnum{
		/**
		 * 支付成功消息.
		 */
		successPay(1, "支付成功"),
		/**
		 * 关闭订单.
		 */
		closeOrder(5, "关闭订单"),
		/**
		 * 订单已退款.
		 */
		refundOrder(6, "订单已退款");

		private int value;
		private String text;

		private OrderSendTypeEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public static String getName(Integer value) {
				if(value == null) 
					return "";
				for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
					if (c.getValue()== value) {
						return c.toString();
					}
				}
				return null;
			}
			
			
			public static OrderSendTypeEnum getByName(String value) {
				if(value == null) 
					return null;
				for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
					if (value.equals(c.toString())) {
						return c;
					}
				}
				return null;
			}
			
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static OrderSendTypeEnum getByValue(Integer value) {
			if(value == null) 
				return null;
			for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
				if (c.getValue()== value) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static OrderSendTypeEnum getByText(String value) {
			if(value == null) 
				return null;
			for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
				if (c.getText().equals( value)) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (OrderSendTypeEnum c : OrderSendTypeEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
	
	/**
	 * 退款状态.
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月7日
	 */
	public enum OrderRefundStatusEnum{
		/**
		 * 1	已申请
			4	同意
			5	拒绝
			6	寄回发票
			7	退款完成
			8	撤回
			9	超时关闭
			10	操作中
		 */
		/**
		 * 已申请.
		 */
		created(1, "已申请"),
		/**
		 * 同意.
		 */
		agree(4, "同意"),
		/**
		 * 拒绝.
		 */
		disagree(5, "拒绝"),
		/**
		 * 寄回发票..
		 */
		sendInvoice(6, "寄回发票"),
		/**
		 * 退款完成.
		 */
		success(7, "退款完成"),
		/**
		 * 撤回.
		 */
		cancel(8, "撤回"),
		/**
		 * 超时关闭.
		 */
		overTimeClose(9, "超时关闭"),
		/**
		 * 操作中.
		 */
		refunding(10, "操作中");

		private int value;
		private String text;

		private OrderRefundStatusEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (OrderRefundStatusEnum c : OrderRefundStatusEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static OrderRefundStatusEnum getByValue(Integer value) {
			if(value == null) 
				return null;
			for (OrderRefundStatusEnum c : OrderRefundStatusEnum.values()) {
				if (c.getValue()== value) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static OrderRefundStatusEnum getByText(String value) {
			if(value == null) 
				return null;
			for (OrderRefundStatusEnum c : OrderRefundStatusEnum.values()) {
				if (c.getText().equals( value)) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (OrderRefundStatusEnum c : OrderRefundStatusEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (OrderRefundStatusEnum c : OrderRefundStatusEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
	/**
	 * 退款创建人类型.
	 * 1.自己创建
	 * 2.业务人员创建
	 * @author Acci(Chunsun Qin)
	 * @date 2020年4月26日
	 */
	public enum OrderRefundCreatorTypeEnum{
		
		/**
		 * 订单本人创建.
		 */
		selfCreate(1, "本人创建"),
		/**
		 * 后台业务人员创建.
		 */
		adminCreate(2, "业务人员创建"),
		/**
		 * 系统自动创建(一般为支付异常时产生).
		 */
		systemCreate(9, "系统自动创建")
		;

		private int value;
		private String text;

		private OrderRefundCreatorTypeEnum(Integer value, String text) {
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static String getTextByValue(Integer value) {
			if(value == null) 
				return "";
			for (OrderRefundCreatorTypeEnum c : OrderRefundCreatorTypeEnum.values()) {
				if (c.getValue()== value) {
					return c.getText();
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static OrderRefundCreatorTypeEnum getByValue(Integer value) {
			if(value == null) 
				return null;
			for (OrderRefundCreatorTypeEnum c : OrderRefundCreatorTypeEnum.values()) {
				if (c.getValue()== value) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 根据枚举id 获取名称.
		 * @param value
		 * @return
		 */
		public static OrderRefundCreatorTypeEnum getByText(String value) {
			if(value == null) 
				return null;
			for (OrderRefundCreatorTypeEnum c : OrderRefundCreatorTypeEnum.values()) {
				if (c.getText().equals( value)) {
					return c;
				}
			}
			return null;
		}
		/**
		 * 返回所有枚举数据为list , 
		 * @return
		 */
		public static List toList()
		{
			ArrayList list = new ArrayList();
			for (OrderRefundCreatorTypeEnum c : OrderRefundCreatorTypeEnum.values()) {
				HashMap mp = new HashMap();
				mp.put("key",c.getValue());
				mp.put("text",c.getText());
				list.add(mp);
			}
			
			return list;
			
		}
		
		public static HashMap toMap()
		{
			HashMap mp = new HashMap();
			for (OrderRefundCreatorTypeEnum c : OrderRefundCreatorTypeEnum.values()) {
				mp.put(c.getValue(),c.getText());
			}
			return mp;
		}		
	}
}
