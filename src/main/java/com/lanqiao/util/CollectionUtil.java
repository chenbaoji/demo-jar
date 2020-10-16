/*
 * File name:          CollectionUtil.java
 * Copyright@Handkoo (China)
 * Editor:           JDK1.6.32
 */
package com.lanqiao.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * TODO: File comments
 * <p>
 * <p>
 * Author:           卢锡文
 * <p>
 * Date:           2017年7月6日
 * <p>
 * Time:           下午3:05:26
 * <p>
 * Director:        卢锡文
 * <p>
 * <p>
 */

public class CollectionUtil {

	/**
	 * 不允许实例化
	 */
	private CollectionUtil() {
	}

	/**
	 *  获取两个集合的不同元素
	 * @param collmax
	 * @param collmin
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Collection getDiffent(Collection collmax, Collection collmin) {
		//使用LinkeList防止差异过大时,元素拷贝
		Collection csReturn = new LinkedList();
		Collection max = collmax;
		Collection min = collmin;
		//先比较大小,这样会减少后续map的if判断次数
		if (collmax.size() < collmin.size()) {
			max = collmin;
			min = collmax;
		}
		//直接指定大小,防止再散列
		Map<Object, Integer> map = new HashMap<Object, Integer>(max.size());
		for (Object object : max) {
			map.put(object, 1);
		}
		for (Object object : min) {
			if (map.get(object) == null) {
				csReturn.add(object);
			} else {
				map.put(object, 2);
			}
		}
		for (Map.Entry<Object, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				csReturn.add(entry.getKey());
			}
		}
		return csReturn;
	}

	/**
	 *  获取两个集合的不同元素,去除重复
	 * @param collmax
	 * @param collmin
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Collection getDiffentNoDuplicate(Collection collmax, Collection collmin) {
		return new HashSet(getDiffent(collmax, collmin));
	}

}
