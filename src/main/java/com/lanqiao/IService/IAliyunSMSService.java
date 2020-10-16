package com.lanqiao.IService;

import com.lanqiao.common.Result;

public interface IAliyunSMSService {

	

	/**
	 * 发送验证码短信
	 * @param code
	 * @param phone
	 */
	public Result sendCodeMsg(String code ,String phone) throws Exception ;
	
	
	
}
