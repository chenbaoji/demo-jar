package com.lanqiao.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//test...
public class Result implements Serializable{

	int code ;
	String msg;
	HashMap data = new HashMap();
	
	public Object removeData(String key)
	{
		return data.remove(key);
	}
	@JsonAnySetter
	public void addData(String key , Object oval)
	{
		data.put(key, oval);
	}
	
	public Boolean isSucc()
	{
		return this.getCode() ==200? true:false;
		
	}
	public String toJson()
	{
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.putAll(this.getAllData());
		String s = JSON.toJSONString(mp,SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue);
		return s;
		
	}
	
	public  String toJson( String[] ignorefileds)
	{
		ExclusionStrategy stra = new ExclusionStrategy()
		{

			@Override
			public boolean shouldSkipField(FieldAttributes f)
			{
				// TODO Auto-generated method stub
				if (ignorefileds != null)
					for (String fname : ignorefileds)
					{
						if (fname.equals(f.getName()))
						{
							return true;
						}

					}
				return false;
			}

			@Override
			public boolean shouldSkipClass(Class<?> clazz)
			{
				// TODO Auto-generated method stub
				return false;
			}
		};

		Gson gson = new GsonBuilder().setExclusionStrategies(stra).serializeNulls().setDateFormat("yyyy-MM-dd HH:mm")
				.setPrettyPrinting().create();
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.putAll(this.getAllData());
		return gson.toJson(mp);
	}
	
	public String toJsonExcludeNull()
	{
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.putAll(this.getAllData());
		String s = JSON.toJSONString(mp,SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat);
		return s;
		
	}
	public String toJsonWithDateFormat(String strformat)
	{
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.putAll(this.getAllData());
		return JSON.toJSONStringWithDateFormat(mp, strformat, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue);
		
	}

	
	
	public String toJson(String dateformat)
	{
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.putAll(this.getAllData());
		String s = JSON.toJSONStringWithDateFormat(mp, dateformat, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue);
		return s;
	}
	public Object toJsonAsObject()
	{
		HashMap mp = new HashMap();
		mp.put("code", this.getCode());
		mp.put("msg", this.getMsg());
		mp.putAll(this.getAllData());
		
		return mp;
	}
	@JsonAnyGetter
	public HashMap getAllData()
	{
		return data;
	}
	
	public void addAll(Map mp)
	{
		data.putAll(mp);
	//	WebUtil.printMap(data);
	}
	@JsonAnyGetter
	public Object getData(String key)
	{
		return data.get(key);
		
		
	}
	public Result(int incode , String inmsg)
	{
		this.code = incode;
		this.msg = inmsg;
	}
	
	public Result()
	{
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

	public static Result succ()
	{
		return new Result(200,"");
	}
	
	public static Result succ(final Object obj)
	{
		Result res= new Result(200,"");
		res.addData("data", obj);
		return res;
	}
	public static Result fail(int code , String msg)
	{
		return new Result(code,msg);
	}
	public static Result failNoLogin()
	{
		return new Result(1000,"未登陆或登陆超时 ");
	}
	public static Result failParam()
	{
		return new Result(301,"参数错误");
	}
}
