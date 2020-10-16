package com.lanqiao.IService;

public interface ISendEmail {

	
	/**
	 * 发送邮件， 
	 * @param touser ：目标邮箱
	 * @param subject ：标题
	 * @param htmlbody ： 发送的邮件内容。
	 * @return
	 * @throws Exception
	 */
	public boolean sendEmail(String touser, String subject , String htmlbody) throws Exception ;
	
}
