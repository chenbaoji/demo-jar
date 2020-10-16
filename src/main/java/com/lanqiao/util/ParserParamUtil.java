package com.lanqiao.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.druid.util.StringUtils;

/**
 * 

 * 按阿里短信的格式查找变量，或替换变量的
 * 如： 
 * 	恭喜您报名成功课程${courseName}，您可关注微信公众号“蓝桥学苑”，进入个人中心—我的课程，进行听课学习，也可登陆网站http://weike.lanqiao.cn进行听课学习。

 * 
 * @author chenbaoji
 *
 */
public class ParserParamUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * 分析字符中的变量，变量格式${param}
	 * @param strbody :字符数据
	 * @param prextag ： 变量开头字符
	 * @param endtag ： 变量结尾字符
	 * @return
	 * @throws Exception
	 */
	public static List<String>  parseParamName(String strbody, String prextag , String endtag)throws Exception 
	{
		List<String> retlist = new ArrayList<String>();
		
		if(StringUtils.isEmpty(strbody))
		{
			return retlist;
		}
		//String strtemp = strbody;
		int fromindex = 0;
		while(true)
		{
			int pos1 = strbody.indexOf(prextag, fromindex);
			if(pos1 ==-1) break;
			int pos2 = strbody.indexOf(endtag, pos1);
			if(pos2 ==-1) 
				{
				
				 throw new Exception("格式不合法，变量要求 ${param}");
				}
			String sname = strbody.substring(pos1+prextag.length(), pos2).trim();
			//System.out.println (sname);
			retlist.add(sname);
			
			fromindex = pos2;
			
		}
		
		return retlist;
		
	}
	
	
	
	/**
	 * 
	 * 变量替换
	 * 
	 * 
	 * @param strbody : 字符数据， 如： aaaaaaa${aaaaa}
	 * @param paramlist ： 变量对应的数值
	 * @param prextag ： 变量开头字符 ${
	 * @param endtag ： 变量结尾字符 }
	 * @return
	 * @throws Exception
	 */
	public static String  replaceParam(String strbody , HashMap<String,String> paramlist, String prextag , String endtag)throws Exception 
	{
		StringBuffer buff =new StringBuffer(strbody.length() + 200);
		int fromindex = 0;
		while(true)
		{
			int pos1 = strbody.indexOf(prextag, fromindex);
			if(pos1 ==-1) break;
			
			
			int pos2 = strbody.indexOf(endtag, pos1);
			if(pos2 ==-1) 
			{
				 throw new Exception("格式不合法，变量要求 ${param}");
			}
			String sname = strbody.substring(pos1+prextag.length(), pos2).trim();
			//String spdata = "";
			if(fromindex !=0)
				fromindex += endtag.length();
			
		
			buff.append(strbody.substring(fromindex, pos1));
			
			String sval =null;
			if(paramlist !=null && paramlist.size() >0)
			sval = paramlist.get(sname);
			if(sval !=null)
			{
				buff.append(sval);
			}
			
			fromindex = pos2;
			
		}
		
		if(fromindex < strbody.length()  && fromindex !=0 )
		{
			
			buff.append(strbody.substring(fromindex+endtag.length()));
		}
		
		if(fromindex < strbody.length()  && fromindex ==0 )
		{
			
			buff.append(strbody.substring(fromindex));
		}
		
		return buff.toString();
	}
}
