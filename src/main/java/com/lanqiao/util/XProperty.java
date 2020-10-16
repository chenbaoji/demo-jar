package com.lanqiao.util;

import java.util.List;
import java.util.Map;

public class XProperty
{
	String srckeyName;
	String destkeyName;
	String textName; 
	String addName; 
	Map  dictmap;
	Object extobj;
	Class<?> tagetClass;
	
	public XProperty(String fname , String toname, Map mp)
	{
		this.srckeyName = fname;
		this.destkeyName = fname;
		this.addName = toname;
		this.textName= toname;
		this.dictmap = mp;
	}
	public XProperty(String fname , String toname, Map mp,Class<?> tagetClass)
	{
		this.srckeyName = fname;
		this.destkeyName = fname;
		this.addName = toname;
		this.textName= toname;
		this.dictmap = mp;
		this.tagetClass=tagetClass;
	}

	
	public XProperty(String srcname ,String destname , String tname, String addname, Map mp)
	{
		this.srckeyName = srcname;
		this.destkeyName = destname;
		this.textName= tname;
		this.addName = addname;
		this.dictmap = mp;
	}
	
	
	
	public static XProperty ToPropery(String fname , String toname, Map mp)
	{
		return new XProperty(fname, toname, mp);
	}
	public static XProperty ToPropery(String fname , String toname, Map mp,Class<?> tagetClass)
	{
		return new XProperty(fname, toname, mp,tagetClass);
	}
	
	
	/**
	 * 
	 * @param srcname : list元素id 属性名字
	 * @param destname :map中的id 名字
	 * @param textname : 获取map中对象的属性名
	 * @param addname :添加到list 中的属性名
	 * @param mp
	 * @return
	 */
	public static XProperty ToPropery(String srcname ,String destname , String textname , String addname, Map mp)
	{
		return new XProperty(srcname, destname,textname,addname,mp);
	}

	public String getSrckeyName()
	{
		return srckeyName;
	}

	public String getDestkeyName()
	{
		return destkeyName;
	}

	public String getAddName()
	{
		return addName;
	}

	public Map getDictmap()
	{
		return dictmap;
	}

	public Object getExtobj()
	{
		return extobj;
	}

	public void setSrckeyName(String srckeyName)
	{
		this.srckeyName = srckeyName;
	}

	public void setDestkeyName(String destkeyName)
	{
		this.destkeyName = destkeyName;
	}

	public void setAddName(String addName)
	{
		this.addName = addName;
	}

	public void setDictmap(Map dictmap)
	{
		this.dictmap = dictmap;
	}

	public void setExtobj(Object extobj)
	{
		this.extobj = extobj;
	}

	public String getTextName()
	{
		return textName;
	}

	public void setTextName(String textName)
	{
		this.textName = textName;
	}
	public Class<?> getTagetClass() {
		return tagetClass;
	}
	public void setTagetClass(Class<?> tagetClass) {
		this.tagetClass = tagetClass;
	}

	
}
