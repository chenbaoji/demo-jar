package com.lanqiao.IService;

import java.util.HashMap;

import com.lanqiao.common.Result;
import com.lanqiao.model.CompanyUser;
import com.lanqiao.model.SSOSessionUser;
import com.lanqiao.model.User;

/**
 *  账户中心
 *  按手机号,邮箱查询注册信息. 
 *  
 * @author kevin
 *
 */
public interface IUserService
{
	/**
	 * 新增企业账户.
	 * @param emailorphone
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public Result  createComanyUser(String emailorphone, String password)throws Exception ;
	
	/**
	 * 返回个人用户的注册信息. 
	 * @param emailorphone : 邮箱或手机号
	 * @return : null , 没有注册. 
	 */
	public User findUser(String emailorphone ) throws Exception ;
	
	/**
	 * 查询企业账户的注册信息. 
	 * @param emailorphone : 手机号或邮箱
	 * @return : null: 没有注册. 
	 */
	public CompanyUser  findComanyUser(String emailorphone)throws Exception ;
	

	/**
	 *  统一签名算法, 
	 *  http://...a.do?para1=222&param2=333&sign=签名数据.
	 * @param param : url 中的参数数据. 
	 * @return
	 * 最后的产生的字符串要放入url 中作为参数sign 的数值
	 */
	public String createURLSign(HashMap param )throws Exception ;
	
	
	/**
	 * 将url 中参数放入param 中, 通过这个接口验证签名是否正确. 
	 * 
	 * @param param : 其中必须有sign 参数
	 * @return  : true : 签名正确, false : 签名错误
	 *   
	 */
	public boolean isValidSign(HashMap param )throws Exception ;
	
	/**
	 * 根据token 得到个人用户信息
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public User getUserByToken(String token )throws Exception ;
	
	public CompanyUser getCompUserByToken(String token )throws Exception ;
	
	/**
	 * 根据lqtoken 得到账户信息.
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public SSOSessionUser getSessionUserByToken(String token )throws Exception ;
	
	/**
	 * 登陆
	 * @param loginname
	 * @param userpass
	 * @return
	 * @throws Exception
	 */
	public CompanyUser CompanyUserLogin(String loginname , String userpass )throws Exception ;
	/**
	 * 获取一个新的用户id
	 * @return
	 * @throws Exception
	 */
	public Long createSSOUserid()throws Exception ;
	/**
	 * 传入sso 的用户id ,查询这个用户是否存在已经usertype
	 * @param ssouserid
	 * @return
	 * @throws Exception
	 */
	public SSOSessionUser getUserById(Long ssouserid )throws Exception ;
	
}
