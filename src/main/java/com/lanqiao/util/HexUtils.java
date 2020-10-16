package com.lanqiao.util;

import org.apache.commons.codec.binary.Hex;

public class HexUtils {

	public static void main(String[] args) throws Exception 
	{
		String sdata ="aaa.jsp?id=222&b=大大";
		String hexval = byte2hex(sdata.getBytes("UTF-8"));
		System.out.println (hexval);
		
		String s = new String(hex2byte(hexval),"UTF-8");
		System.out.println (s);
	}

	
	public static String byte2hex(byte[] input) {
	    return Hex.encodeHexString(input);
	}
	
	
	public static byte[] hex2byte(String input) throws Exception 
	{
	    return Hex.decodeHex(input.toCharArray());
	}
	
	public static String  hex2String(String input) throws Exception 
	{
	    byte b[] =  Hex.decodeHex(input.toCharArray());
	    
	    return new String(b,"UTF-8");
	}
	

	
}
