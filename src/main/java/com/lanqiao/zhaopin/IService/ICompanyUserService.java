package com.lanqiao.zhaopin.IService;

import java.util.HashMap;
import java.util.List;

import com.lanqiao.common.Result;
import com.lanqiao.model.zhaopin.CompanyWithBLOBs;

public interface ICompanyUserService {

	/**
	 * 是否已经开通了企业账户
	 * @param loginname
	 * @return : true 已经开通, false : 未开通
	 * @throws Exception
	 */
	public Boolean hasOpenUser(Long ssouserid) throws Exception;

	/**
	 * 多条件查询,   admin 项目使用. 
	 * @param findval
	 * @param pageno
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public List<CompanyWithBLOBs> FindCompany(HashMap<String, Object> findval, Integer pageno, Integer pagesize)
			throws Exception;

	//总条数
	public Integer FindCompanyCount(HashMap<String, Object> findval) throws Exception;

	/**
	 * 根据企业id 查询到企业信息.
	 * @param compid
	 * @return
	 * @throws Exception
	 */
	public CompanyWithBLOBs FindOneCompanyById(Long compid) throws Exception;

	/**
	 *  企业信息保存. 
	 *  
	 * @param compdata  : 如果企业id 不为空, 那么就做修改操作, 否则就insert
	 * @return
	 * @throws Exception
	 */

	public CompanyWithBLOBs SaveCompany(CompanyWithBLOBs compdata) throws Exception;

	/**
	 * 删除企业相关的信息。 
	 * @param compid
	 * @return
	 */
	public Result deleteCompany(Long compid) throws Exception;

	/**
	 * 多条件查询,   admin 项目使用. 
	 * @param findval
	 * @param pageno
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public List<CompanyWithBLOBs> findwscompany(HashMap<String, Object> findval, Integer pageno, Integer pagesize)
			throws Exception;

	//总条数
	public Integer findwsCompanyCount(HashMap<String, Object> findval) throws Exception;

	public Result wsopen(CompanyWithBLOBs company) throws Exception;

	public Result wsclose(long compId) throws Exception;

	public Result updateCompanyStatus(CompanyWithBLOBs company) throws Exception;
}
