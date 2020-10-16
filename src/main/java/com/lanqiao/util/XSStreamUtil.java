package com.lanqiao.util;

import java.io.Writer;
import java.util.Date;

import org.apache.commons.lang3.StringEscapeUtils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class XSStreamUtil {

/**
 * 支持cdata 的XStream
 * @return
 */
	public static XStream getXStream()
	{

		XStream xs = new XStream(new XppDriver(new NoNameCoder()) {
 
            @Override
            public HierarchicalStreamWriter createWriter(Writer out) {
                return new PrettyPrintWriter(out) {
                    boolean cdata = true;
 
                    @Override
                    @SuppressWarnings("rawtypes")
                    public void startNode(String name, Class clazz) {
                        super.startNode(name, clazz);
                    }
 
                    @Override
                    public String encodeNode(String name) {
                        return name;
                    }
 
 
                    @Override		
                    protected void writeText(QuickWriter writer, String text) {
                        if (cdata) {
                            writer.write("<![CDATA[");
                            writer.write(text);
                            writer.write("]]>");
                        } else {
                            writer.write(text);
                        }
                    }
                };
            }
        });
		
		
		return xs;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//XStream xs = initXStream(true);
		
//
//		xs.processAnnotations(TestBean.class);  
//		
//		TestBean t  =new TestBean();
//		t.setContent("<2344444>测试了");
//		t.setNewsid(11111L);
//		t.setCreatetime(new Date());
//		String s = xs.toXML(t);
//		
//		System.out.println (s);
		
//		 String transXml = StringEscapeUtils.unescapeXml(s);  
	//     System.out.println(transXml);  
	}
	
	
	
	
	
	/** 
	 * 处理JAVA对象转换成XML时添加<!CDATA[ ]]>标签 
	 * @author  kongxiaoqian 
	 * @version 1.0 
	 */  
	public static class CDATAConvert implements Converter { 
	  
	    /** 
	     * java对象转换为xml 
	     */  
	    public void marshal(Object object, HierarchicalStreamWriter writer,  
	            MarshallingContext context) {  
	          
	        String prefix = "<![CDATA[";  
	        String suffix = "]]>";  
	        String trans = prefix + object + suffix;  
	        writer.setValue(trans);  
	    }  
	  
	    /** 
	     * xml转换成JAVA对象 
	     */  
	    public Object unmarshal(HierarchicalStreamReader reader,  
	            UnmarshallingContext context) {  
	  
	        return reader.getValue();  
	    }  
	  
	    /** 
	     * 判断字段是否是需要转换的类型 
	     */  
	    public boolean canConvert(Class paramClass) {  
	        return String.class.isAssignableFrom(paramClass);  
	    }  
	  
	}  

	
	public static class DateConvert implements Converter { 
		  
	    /** 
	     * java对象转换为xml 
	     */  
	    public void marshal(Object object, HierarchicalStreamWriter writer,  
	            MarshallingContext context) {
	    	
	    	Date d = (Date)object;
	    	if(d !=null)
	    	{
	    		long lval = d.getTime()  /1000;
	    		
	    		writer.setValue(lval +"");  
	    	}
	    	
	    }  
	  
	    /** 
	     * xml转换成JAVA对象 
	     */  
	    public Object unmarshal(HierarchicalStreamReader reader,  
	            UnmarshallingContext context) {  
	    	Long lval = 0L;
	        if(reader.getValue() !=null)
	        	lval = new Long(reader.getValue() );
	        return lval;
	        
	    }  
	  
	    /** 
	     * 判断字段是否是需要转换的类型 
	     */  
	    public boolean canConvert(Class paramClass) {  
	        return Date.class.isAssignableFrom(paramClass);  
	    }  
	  
	}  
	
	
}
