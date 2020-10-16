package com.lanqiao.IService;

import java.util.List;

import com.lanqiao.common.Result;
import com.lanqiao.model.TaskMessage;
import com.lanqiao.util.ExcelUtils.SheetData;

public interface ISendWeixinMsgService
{

	
	public void saveCustomMsg(SheetData sheetdata, TaskMessage task);
	
	
	public List<TaskMessage> findMsgQueue();
	
	
	public Result stopTask(Long msgid);
	
}
