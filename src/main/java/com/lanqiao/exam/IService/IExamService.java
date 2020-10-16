/*
 * File name:          IExamService.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.8
 */
package com.lanqiao.exam.IService;

import java.util.HashMap;
import java.util.List;

import com.lanqiao.common.Result;
import com.lanqiao.model.exam.EXCompany;

/**
 * TODO: 测评系统接口
 * <p>
 * <p>
 * Author:          lxw
 * <p>
 * Date:           2019年9月26日
 * <p>
 * Time:           下午3:53:42
 * <p>
 * Director:        lxw
 * <p>
 * <p>
 */
public interface IExamService {
	/**
	 * 查询用户开通记录
	 */
	public List<EXCompany> findCompany(HashMap<String, Object> findval, Integer pageno, Integer pagesize)
			throws Exception;

	/**
	 * 查询企业用户数量
	 */
	public int findCompanyCount(HashMap<String, Object> findval) throws Exception;

	public Result updateCompanyStatus(EXCompany company) throws Exception;

	public Result getCompanyReport() throws Exception;
}
