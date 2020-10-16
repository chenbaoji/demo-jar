package com.lanqiao.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Map<Object, Object> bean2map(Object bean) throws Exception {

		Map<Object, Object> map = new HashMap<>();
		if(bean ==null)
			return  map;
		
		BeanInfo info = Introspector.getBeanInfo(bean.getClass(), Object.class);
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			Object key = pd.getName();
			Object value = pd.getReadMethod().invoke(bean);
			map.put(key, value);
		}
		return map;
	}
	
/**
 * 拷贝对象. 	
 * @param dest : 目标对象
 * @param orig : 源数据对象. 
 * @throws Exception
 */
	public static void CopyBean(Object dest , Object orig)throws Exception 
	{
		 org.apache.commons.beanutils.BeanUtils.copyProperties(dest, orig);
	}
	
	
	public static <T> T MaptoBean2(Map<String, Object> map, Class<T> beanClass) throws Exception
	{
		
		
	        if (map == null)    
	            return null;    
	        T obj = beanClass.newInstance();    
	        org.apache.commons.beanutils.BeanUtils.populate(obj, map);    
	        return obj;    
	}
	
	
	
//	
//	public static Object MaptoBean(Map<String, Object> map, Class<?> beanClass) throws Exception {      
//        if (map == null)    
//            return null;    
//        Object obj = beanClass.newInstance();    
//        org.apache.commons.beanutils.BeanUtils.populate(obj, map);    
//        return obj;    
//    }
	public static List<HashMap>  BeanListToMap(List beanlist) throws Exception {    
		List al= new ArrayList();
		for(Object o :beanlist)
		{
			al.add(BeanToMap(o));
		}
		return al;
	}
	
	
	
	public static Map  BeanToMap(Object bean) throws Exception {    
		Map<Object, Object> map = new HashMap<>();
		BeanInfo info = Introspector.getBeanInfo(bean.getClass(), Object.class);
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			Object key = pd.getName();
			Object value = null;
			Method readMethod = pd.getReadMethod();
			if(readMethod!=null) {
				value=readMethod.invoke(bean);
			}
			map.put(key, value);
		}
		return map;
    }
	/**
	 * 对象转map,并在每个属性前加上前缀.
	 * @param bean
	 * @param prefix 前缀
	 * @return
	 */
	public static Map  BeanToMapWithPrefix(Object bean,final String prefix){    
		if(bean==null){
			return null;
		}
		Map<Object, Object> map = new HashMap<>();
		BeanInfo info=null;
		try {
			
			info = Introspector.getBeanInfo(bean.getClass(), Object.class);
		} catch (IntrospectionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(info==null) {
			return null;
		}
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			Object key = pd.getName();
			Object value=null;
			try {
				value = pd.getReadMethod().invoke(bean);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put(prefix+key, value);
		}
		return map;
    }
         
}
