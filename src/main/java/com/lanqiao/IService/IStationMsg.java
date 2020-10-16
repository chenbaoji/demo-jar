package com.lanqiao.IService;

import java.util.HashMap;
import java.util.List;

import com.lanqiao.common.Result;
import com.lanqiao.model.StationMsg;

/**
 * 站内消息接口
 *  
 * @author kevin
 *
 */
public interface IStationMsg
{
	/**
	 * 发送站内消息
	 * @param msg
	 * @return
	 * @throws Exception
	 */
	public StationMsg sendMsg( StationMsg msg) throws Exception ;
	
	
	/**
	 * 标记消息为已经阅读状态。 
	 * @param msgids
	 * @return
	 * @throws Exception
	 */
	public  Result UpdateReadTag(List<Long> msgids)throws Exception ;
	
	
	/**
	 * 查询消息
	 * @param param ： 
	 * 			appid->业务id， channelid -->栏目id， userid-》用户id ，必填
	 * 
	 * @param pageno
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public Result FindMsg(HashMap param , Integer pageno , Integer pagesize) throws Exception ;
	
	
}
