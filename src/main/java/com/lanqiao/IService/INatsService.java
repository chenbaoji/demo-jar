package com.lanqiao.IService;

import com.lanqiao.common.Result;

public interface INatsService {

/**
 *  发布消息到nats 消息服务器. 	
 * @param subject : 主题名称
 * @param msgdata : 消息内容, 
 * @return
 * @throws Exception
 */
public Result publish(String subject,String msgdata) throws Exception;
		
	
}
