package com.lanqiao.IService;

public interface IGlobalErrmsg {

	

	/**
	 * 错误信息存储。 
	 * @param msg
	 */
	public void WriteLog(String serviceid ,String classname ,  String  msg);
	
	
}
