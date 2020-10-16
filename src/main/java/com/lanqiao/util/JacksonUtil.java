package com.lanqiao.util;

import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * @author xiaochou
 * @info 使用jackson对bean和Xml进行相互转化
 */
public class JacksonUtil {
	
	/**
	 * 
	 * @param t
	 * @return
	 * @throws Exception
	 * @info 将对象转换成json字符串
	 */
	public static <T> String beanToJson(T t) throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(t);
	}
	
	public static<T> T jsonToBean(String s,Class<T> t) throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(s.getBytes("utf-8"),t);
	}
	
	
}
