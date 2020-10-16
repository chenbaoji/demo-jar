package com.lanqiao.util;

import java.io.StringWriter;
import java.util.HashMap;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreeMakerUtils
{

	/**
	 * 将变量应用到 模板中, 最后得到结果
	 * @param param
	 * @param templatedata
	 * @return
	 */
	public static String getResultString(HashMap param, String templatedata)
	{
		
		try
		{
		 	Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);  
	        StringTemplateLoader templateLoader = new StringTemplateLoader();  
	        configuration.setTemplateLoader(templateLoader);  
	        configuration.setDefaultEncoding("UTF-8"); 
	        configuration.setNumberFormat("#");
	        
	        
	        StringWriter stringWriter = new StringWriter();  
	        Template template = new Template(CommonUtil.genUUID(), templatedata, configuration);  
	        template.process(param, stringWriter);  
	      	
	        return (stringWriter.toString());  
	      	
		}catch(Exception se)
		{
			se.printStackTrace();
			return null;
		}
	        
	        
	}
}
