package com.lanqiao.IService;

import java.math.BigDecimal;

/**
 * 用户积分接口
 * @author kevin
 *
 */
public interface IUserPoint extends IDealTransation
{
	/**
	 * 申请一个扣款交易，申请成功后，返回交易流水号。 
	 * @param context
	 * @return : -1失败, >0 交易流水号
	 */
	public Long DeductPoint(Long userid , BigDecimal point, String desc) throws Exception ;
	
	/**
	 * 充值交易
	 * @param userid
	 * @param money
	 * @return -1失败, >0 交易流水号
	 * @throws Exception
	 */
	public Long chargePoint(Long userid , BigDecimal point, String desc) throws Exception ;
	
	/**
	 * 查询用户账户金额
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public BigDecimal findUserPoint(Long userid)throws Exception ;
}
