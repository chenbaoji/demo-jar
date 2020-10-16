package com.lanqiao.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Formatter;
/**
 * 实现sha 散列加密算法。 
 * @author chenbaoji
 *
 */
public class SHAEncrypt {

	 public static final String KEY_SHA = "SHA-1";   

		
		private static String byteToHex(final byte[] hash) {
			Formatter formatter = new Formatter();
			for (byte b : hash) {
				formatter.format("%02x", b);
				
			}
			String result = formatter.toString();
			formatter.close();
			return result;
		}
	 /**
	  * sha 散列加密算法
	  * @param inputStr
	  * @return
	  */
	    public static  String  Encode(String inputStr)
	    {
	    	String ret = "";
	        try {
	        	  byte[] inputData = inputStr.getBytes("UTF-8");   
	             MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);  
	             messageDigest.update(inputData);
	             byte bb[]= messageDigest.digest();
	             
	             System.out.println("byte size:" + bb.length);
	             //ret = java.util.Base64.getEncoder().encodeToString(bb);
	             ret = byteToHex(bb);
	        } catch (Exception e) {e.printStackTrace();}
	       
	        return ret;
	        
	    }

public static void main(String[] args) {
	
	{
	String s = SHAEncrypt.Encode("a");
	
	System.out.println (s);
	}
	{
		String s = SHAEncrypt.Encode("a");
		
		System.out.println (s);
		}
	{
		String s = SHAEncrypt.Encode("a");
		
		System.out.println (s);
		}
	
	
}
}
