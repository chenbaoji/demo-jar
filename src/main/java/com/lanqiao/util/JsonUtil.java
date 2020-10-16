package com.lanqiao.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
/**
 * 这个json 有个bug , Integer 对象回转成  double 
 * @author kevin
 *
 */
public class JsonUtil
{

	/**
	 * 对象转json字符串
	 * 
	 * @param <T>
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public static <T> String beanToJson(T t)
	{
		Gson gson = new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm").setPrettyPrinting().create();
		try
		{
			return gson.toJson(t);
		} catch (Exception se)
		{
			return null;
		}
		
	}

	/**
	 * json字符转对象
	 * 
	 * @param <T>
	 * @param s
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public static <T> T jsonToBean(String s, Class<T> t)
	{
		Gson gson = new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm").setPrettyPrinting().create();
		try
		{
			return gson.fromJson(s, t);
		} catch (Exception se)
		{
			se.printStackTrace();
			return null;
		}
	}
	
	public static <T> T jsonToBean(String s, Class<T> t,String dateformat)
	{
		Gson gson = new GsonBuilder().serializeNulls().setDateFormat(dateformat).setPrettyPrinting().create();
		try
		{
			return gson.fromJson(s, t);
		} catch (Exception se)
		{
			se.printStackTrace();
			return null;
		}
	}
	
	public static <T> List<T> getObjectList(String jsonString,Class<T> cls){
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, cls);
             
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
	
	private static void recursionList(List arrlist , JSONArray arr)
	{
		for (int i = 0; i < arr.size(); i++)
			{
				HashMap retmap = new HashMap();
			
			
				JSONObject one = arr.getJSONObject(i);
				Iterator<Map.Entry<String,Object>> it = one.entrySet().iterator();
				while(it.hasNext())
				{
					Map.Entry<String,Object> entry = it.next();
					Object oval = entry.getValue();
					if(oval instanceof List)
					{
						// 
						System.out.println (entry.getKey()+": is list");
						List temlist  = new ArrayList();
						recursionList(temlist , (JSONArray)oval);
						
					}
					else
					{
						retmap.put(entry.getKey(), oval);
					}
					
					
				}
				
				
				arrlist.add(retmap);
				
			}
		
	}
/**
 * 将所有的json 节点都转成hashmap; 默认方法只转第1层的节点为hashmap
 * @param strdata
 * @return
 */
	public static HashMap  parseAllNodeToMap(String strdata)
	{
		HashMap retmap = new HashMap();
		try
		{
			JSONObject root = JSON.parseObject(strdata);
			Iterator<Map.Entry<String,Object>> it = root.entrySet().iterator();
			while(it.hasNext())
			{
				Map.Entry<String,Object> entry = it.next();
				Object oval = entry.getValue();
				if(oval instanceof List)
				{
					
					//System.out.println (entry.getKey()+": is list");
					List arrlist  = new ArrayList();
					recursionList(arrlist, (JSONArray)oval);
					retmap.put(entry.getKey(), arrlist);
					
				}
				else
					retmap.put(entry.getKey(), oval);
			}


		} catch (Exception se)
		{
			se.printStackTrace();
		}

		return retmap;

	}
	/**
	 * 解析json 字符串为数组
	 * @param <T>
	 * @param jsonString
	 * @param cls
	 * @return
	 */
//	public static <T> List<T> getObjectList(String jsonString,Class<T> cls){
//        List<T> list = new ArrayList<T>();
//        try {
//            Gson gson = new Gson();
//            JsonArray arry = new JsonParser().parse(jsonString).getAsJsonArray();
//            for (JsonElement jsonElement : arry) {
//                list.add(gson.fromJson(jsonElement, cls));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

}