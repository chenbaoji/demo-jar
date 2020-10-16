package com.lanqiao.IService;

/**
 * 产生全局唯一的id, 
 * 
 * @author kevin
 *
 */
public interface IUniqueLong
{
	/**
	 * 产生唯一的long 数字.
	 * @param key : 分类名称. 同一分类下产生的long 不会重复. 
	 * 			 如: key 可以是一个表名, 生成一个表的主键id
	 * @return
	 * @throws Exception
	 */
	public Long genLongId(String key) throws Exception ;
	//产生唯一的long 数字. 初始值未0
	public Long genLongIdBegin0(String key) throws Exception ;
	
}



