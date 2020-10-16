package com.lanqiao.zhaopin.IService;

import java.util.List;

import com.lanqiao.model.zhaopin.DictCity;
import com.lanqiao.model.zhaopin.DictCollegemajor;
import com.lanqiao.model.zhaopin.DictEducation;
import com.lanqiao.model.zhaopin.DictFinance;
import com.lanqiao.model.zhaopin.DictIndustry;
import com.lanqiao.model.zhaopin.DictNation;
import com.lanqiao.model.zhaopin.DictPostype;
import com.lanqiao.model.zhaopin.DictProvince;
import com.lanqiao.model.zhaopin.DictSalary;
import com.lanqiao.model.zhaopin.DictScale;
import com.lanqiao.model.zhaopin.DictWelfare;
import com.lanqiao.model.zhaopin.DictWorkexp;

public interface IDictService
{
	
	public List<DictNation>  getFindnationall() throws Exception ;
	
	/**
	 * 城市字典表
	 * @return
	 * @throws Exception
	 */
	public List<DictCity>  getCitysList() throws Exception ;
	
	/**
	 * 专业字典
	 * @return
	 * @throws Exception
	 */
	public List<DictCollegemajor>  getCollegeMajorList() throws Exception ;
	
	/**
	 * 学历
	 * @return
	 * @throws Exception
	 */
	public List<DictEducation>  getEducationList() throws Exception ;
	
	/**
	 * 行业字典
	 * @return
	 * @throws Exception
	 */
	public List<DictIndustry>  getIndustryList() throws Exception ;
	
	/**
	 * 职位类型
	 * @return
	 * @throws Exception
	 */
	public List<DictPostype>  getPositionTypeList() throws Exception ;
	
	/**
	 * 省份字典表
	 * @return
	 * @throws Exception
	 */
	public List<DictProvince>  getProvinceList() throws Exception ;
	
	/**
	 * 薪水字典表
	 * @return
	 * @throws Exception
	 */
	public List<DictSalary>  getSalaryList() throws Exception ;
	
	/**
	 * 公司规模
	 * @return
	 * @throws Exception
	 */
	public List<DictScale>  getScaleList() throws Exception ;
	
	/**
	 * 福利待遇
	 * @return
	 * @throws Exception
	 */
	public List<DictWelfare>  getWelfareList() throws Exception ;
	/**
	 * 工作经验
	 * @return
	 * @throws Exception
	 */
	public List<DictWorkexp>  getWorkExpList() throws Exception ;
	
	public List<DictFinance>  getFinanceList() throws Exception ;
	
	
	
	
	
}
