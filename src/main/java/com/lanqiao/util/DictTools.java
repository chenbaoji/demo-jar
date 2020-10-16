package com.lanqiao.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 针对字典表, 从id 转name.
 * @author kevin
 *
 */
public class DictTools
{


	/**
	 * 将srclist 中的元素中的属性作为key , 查找另外一个map中value,
	 * 并放入到map中,
	 * @param srclist
	 * @param plist
	 * @return
	 * @throws Exception
	 */
	public static List<HashMap> ConvertMap(List srclist,XProperty ... plist   )throws Exception 
	{
		List srclistofmap = new ArrayList(srclist.size());
		for(Object o :srclist)
		{
			Map srcmap = null; 
			if(Map.class.isAssignableFrom(o.getClass()))
			{
				 srcmap = (Map)o;
			}else
				srcmap = BeanUtils.BeanToMap(o);
			
			srclistofmap.add(srcmap);
			for(XProperty xp :plist )
			{
				
				Object keyval = srcmap.get(xp.getSrckeyName());
				if(xp.getDictmap() !=null)
				{
					
					Object element = xp.getDictmap().get(keyval);
					if(element !=null && Map.class.isAssignableFrom(element.getClass()))
					{
						// map对象
						Object nameval = ((Map)element).get(xp.getTextName());
						srcmap.put(xp.getAddName(), nameval);
					}
					else if(element !=null && String.class.isAssignableFrom(element.getClass()))
					{
						srcmap.put(xp.getAddName(), element);
					}
					else if(element !=null)
					{
						// 自定义对象
						Object nameval = getFieldValueByFieldName(xp.getTextName(), element);
						srcmap.put(xp.getAddName(), nameval);
					}else
						srcmap.put(xp.getAddName(), "");
				}
			}
		}
		
		
		return srclistofmap;
	}
	
	
	public static Map ConvertObjectToMap(Object model,XProperty ... plist   )throws Exception 
	{
			Map srcmap = null; 
			if(Map.class.isAssignableFrom(model.getClass()))
			{
				 srcmap = (Map)model;
			}else
				srcmap = BeanUtils.BeanToMap(model);
			
		
			for(XProperty xp :plist )
			{
				
				Object keyval = srcmap.get(xp.getSrckeyName());
				if(xp.getDictmap() !=null)
				{
					
					Object element = xp.getDictmap().get(keyval);
					if(element !=null && Map.class.isAssignableFrom(element.getClass()))
					{
						// map对象
						Object nameval = ((Map)element).get(xp.getTextName());
						srcmap.put(xp.getAddName(), nameval);
					}
					else if(element !=null && String.class.isAssignableFrom(element.getClass()))
					{
						srcmap.put(xp.getAddName(), element);
					}
					else if(element !=null)
					{
						// 自定义对象
						Object nameval = getFieldValueByFieldName(xp.getTextName(), element);
						srcmap.put(xp.getAddName(), nameval);
					}else
						srcmap.put(xp.getAddName(), "");
				}
			
			}
		
		
		return srcmap;
	}
	
	
	/**
	 * 获取一个对象的属性名对应的数据.
	 * @param fieldName
	 * @param object
	 * @return
	 */
	 public static Object getFieldValueByFieldName(String fieldName, Object object) {
	        try {
	            Field field = object.getClass().getDeclaredField(fieldName);
	            //设置对象的访问权限，保证对private的属性的访问
	            field.setAccessible(true);
	            Object hisValue = field.get(object);
	            if (null == hisValue) {
	                return  null;
	            }
	            return  hisValue;
	        }catch(Exception se)
	        {
	        	se.printStackTrace();
	        	return null;
	        }
	}

	/**
	 * 将一个list 转成map , 其中list 中的元素的某一个属性名对应的数值作为Map 的key
	 *  value 是 list 中的元素
	 * @param datalist
	 * @param keyname
	 * @return
	 */
	        
	public static HashMap ListToMap(List datalist, String keyname )
	{
		HashMap ret = new HashMap();
		for(Object os : datalist)
		{
			Object keyval = getFieldValueByFieldName(keyname,os );
			ret.put(keyval, os);
		}
		return ret;
	}
	/**
	 * 将obj强转为某类型(未完成所有类型转换).
	 * @param obj
	 * @param targetClass
	 * @return
	 */
	 public static Object changeToType(final Object obj,Class<?> targetClass) {
	    	if(obj==null) {
	    		return null;
	    	}
	    	if(targetClass ==null) {
	    		return obj;
	    	}
	    	if(obj.getClass().isAssignableFrom(targetClass)) {
	    		return obj;
	    	}
	    	if(targetClass.equals(Integer.class)) {
	    		return NullUtil.getInt(obj);
	    	}
	    	if(targetClass.equals(Long.class)) {
	    		return NullUtil.getLong(obj);
	    	}
	    	if(targetClass.equals(String.class)) {
	    		return NullUtil.getString(obj);
	    	}
	    	
	    	return targetClass.cast(obj);
	    }
	
	/**
	 * 将map转为obj ,并设定映射关系.
	 * 
	 * @param source
	 * @param target
	 * @param oldFileds
	 * @param newFiledNames
	 */
	public static void mapToObj(final Map source, final Object target,XProperty ... plist) {
		if (plist != null && plist.length>0) {
			for(XProperty xp :plist )
			{
				
				Object keyval = source.get(xp.getSrckeyName());
				if(xp.getDictmap() !=null) //有字典设置
				{
					
					Object element = xp.getDictmap().get(keyval);
					if(element !=null && Map.class.isAssignableFrom(element.getClass()))
					{
						// map对象
						Object nameval = ((Map)element).get(xp.getTextName());
						source.put(xp.getAddName(),changeToType( nameval,xp.getTagetClass()));
					}
					else if(element !=null && (String.class.isAssignableFrom(element.getClass()) 
							|| Integer.class.isAssignableFrom(element.getClass())
							|| Long.class.isAssignableFrom(element.getClass())
							))
					{
						source.put(xp.getAddName(), changeToType( element,xp.getTagetClass()));
					}
					else if(element !=null)
					{
						// 自定义对象
						Object nameval = getFieldValueByFieldName(xp.getTextName(), element);
						source.put(xp.getAddName(), changeToType( nameval,xp.getTagetClass()));
					}else {
						source.put(xp.getAddName(), null);
					}
				}else { //无字典设置只换名称
					source.put(xp.getAddName(), changeToType( keyval,xp.getTagetClass()));
				}
			
			}
			
		}

		RefUtil.copyPropertiesSimple(source, target);

	}
}
