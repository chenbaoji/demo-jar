package com.lanqiao.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
	
	public static <T> String beanToJson(T t) 
	{
		try
		{
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		return gson.toJson(t);
		}catch(Exception se)
		{
			se.printStackTrace();
		}
		
		return "";
	}
	
	
	public static<T> T jsonToBean(String s,Class<T> t)
	{
		try
		{
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			return gson.fromJson(s,t);
		}catch(Exception se)
		{
			se.printStackTrace();
		}
		
		return null;
	}

	
}
