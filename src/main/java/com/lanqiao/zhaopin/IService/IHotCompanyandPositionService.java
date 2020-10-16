/*
 * File name:          IHotCompanyandPositionService.java
 * Copyright@Lanqiao (China)
 * Editor:           JDK1.8
 */
package com.lanqiao.zhaopin.IService;

import com.lanqiao.common.Result;
import com.lanqiao.model.zhaopin.CJHotCompany;
import com.lanqiao.model.zhaopin.CJHotPosition;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:          lxw
 * <p>
 * Date:           2019年7月22日
 * <p>
 * Time:           下午4:13:56
 * <p>
 * Director:        lxw
 * <p>
 * <p>
 */
public interface IHotCompanyandPositionService {
	public Result HotCompanyList() throws Exception;

	public Result HotPositionList() throws Exception;

	public Result saveHotCompany(CJHotCompany cjHotCompany) throws Exception;

	public Result saveHotPosition(CJHotPosition cjHotPosition) throws Exception;

	public Result delHotCompany(Long compId) throws Exception;

	public Result delHotPosition(Long posId) throws Exception;

	public Result moveHotPosition(Long posId1, Long posId2) throws Exception;

	public Result moveHotCompany(Long compId1, Long compId2) throws Exception;

	public Result findPositionByCompId(long compId) throws Exception;

	public Result findCompany() throws Exception;
}
