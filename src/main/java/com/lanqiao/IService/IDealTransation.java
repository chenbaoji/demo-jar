package com.lanqiao.IService;

import java.util.HashMap;

/**
 * 
 * 为了规避 分布式事务， 业务自己实现2阶段提交
 * 
 * 
 * @author chenbaoji
 *
 */
public interface IDealTransation {
	
	/**
	 * 回滚交易
	 * @param transid
	 */
	public void RollbackDeal(Long transid)throws Exception ;
	
	/**
	 * 提交确认交易
	 * @param transid
	 */
	public void CommitDeal(Long transid)throws Exception ;
	
}
