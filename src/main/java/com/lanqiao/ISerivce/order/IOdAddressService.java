package com.lanqiao.ISerivce.order;

import java.util.List;

import com.lanqiao.model.order.OdAddress;
import com.lanqiao.model.order.OdAddressInfo;

public interface IOdAddressService {
	/**
	 * 新增
	 * @param address
	 * @return
	 */
	OdAddress insertAddr(OdAddress address);
	/**
	 * 修改.
	 * @param address
	 * @return
	 */
	OdAddress updateAddr(OdAddress address);
	/**
	 * 为某个用户找到所有地址.
	 * @param ssoUserId
	 * @return
	 */
	List<OdAddress> findBySsoUserId(long ssoUserId);
	/**
	 * 为某个用户找到默认地址.
	 * @param ssoUserId
	 * @return
	 */
	OdAddress findDefaultAddress(long ssoUserId);
	/**
	 * 按版本号找到地址记录.
	 * @param addressId
	 * @param version
	 * @return
	 */
	OdAddressInfo findByVersion(long addressId, int version);
	/**
	 * 删除地址.
	 * @param ssoUserId 用户编号
	 * @param addressId 地址编号
	 * @return
	 */
	int deleteAddress(long ssoUserId, long addressId);

}
