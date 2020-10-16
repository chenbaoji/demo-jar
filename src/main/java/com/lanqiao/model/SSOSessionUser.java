package com.lanqiao.model;


import java.io.Serializable;

public class SSOSessionUser implements Serializable
{
	Long userid; // 用户id
	int usertype ; // 账户类型， 0： 个人账户， 1： 企业账户
	String loginby="web"; //  登陆方式 web, app,
	String deviceid; // 登陆设备id, 手机上使用
	//public enum EnUsertype {individual,Company};
	String lqtoken ;
	String remoteIp; //登陆ip
	Integer logintype ; // 登陆方式. 
	
	/**
	 * 是否登录
	 * @return
	 */
	public boolean ifLoginUser()
	{
		return userid != null ? true: false;
	}
	
	
	public boolean ifWebUser()
	{
		return "web".equalsIgnoreCase(loginby);
	}
	
	
	public boolean ifAppUser()
	{
		return "app".equalsIgnoreCase(loginby);
	}
	

	
	
	
	public SSOSessionUser()
	{}
	public SSOSessionUser(Long userid, int usertype)
	{
		this.userid = userid;
		this.usertype = usertype;
	}
	
	public Long getUserid()
	{
		return userid;
	}
	public int getUsertype()
	{
		return usertype;
	}
	public void setUserid(Long userid)
	{
		this.userid = userid;
	}
	public void setUsertype(int usertype)
	{
		this.usertype = usertype;
	} 
	
	
	public static void main(String[] args)
	{
	
	}

	public String getLoginby()
	{
		return loginby;
	}

	public String getDeviceid()
	{
		return deviceid;
	}

	public void setLoginby(String loginby)
	{
		this.loginby = loginby;
	}

	public void setDeviceid(String deviceid)
	{
		this.deviceid = deviceid;
	}

	public String getLqtoken()
	{
		return lqtoken;
	}

	public void setLqtoken(String lqtoken)
	{
		this.lqtoken = lqtoken;
	}


	public String getRemoteIp()
	{
		return remoteIp;
	}


	public void setRemoteIp(String remoteIp)
	{
		this.remoteIp = remoteIp;
	}


	public Integer getLogintype()
	{
		return logintype;
	}


	public void setLogintype(Integer logintype)
	{
		this.logintype = logintype;
	}
	
}
