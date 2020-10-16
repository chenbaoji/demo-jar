package com.lanqiao.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @info 对象转换
 * @author xiaochou
 *
 */
public class ObjectUtil {
	
	/**
	 * @info 对象转Map
	 * @param object
	 * @return
	 */
	public static Map<String, Object> object2Map(Object object) {
		Map<String, Object> result = new HashMap<String, Object>();
		// 获得类的的属性名 数组
		Field[] fields = object.getClass().getDeclaredFields();
		try {

			for (Field field : fields) {
				field.setAccessible(true);
				String name = new String(field.getName());
				result.put(name, field.get(object));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
