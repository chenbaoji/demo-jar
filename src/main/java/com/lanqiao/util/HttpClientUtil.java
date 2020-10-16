package com.lanqiao.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

/**
 * @author zjyou
 * @date 2016年7月14日 下午12:12:38
 * @desc HTTP请求工具类
 */
public class HttpClientUtil {

	
	public static String postPlainBodyString(String baseUrl, Map<String, Object> extheader, String bodydata) {

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpost = new HttpPost(baseUrl);
		httpost.addHeader("Cache-Control", "max-age=0");
		httpost.setHeader("Connection", "close");

	
		if (extheader != null) {
			Iterator<Map.Entry<String, Object>> it = extheader.entrySet().iterator();

			while (it.hasNext()) {
				Map.Entry<String, Object> en = it.next();
				httpost.addHeader(en.getKey(), en.getValue().toString());
			}

		}

		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(5000).setConnectTimeout(5000)
				.setSocketTimeout(5000).build();

		httpost.setConfig(requestConfig);
		String respStr = null;
		try {
		
			httpost.setEntity(new StringEntity(bodydata, HTTP.UTF_8));
			httpost.addHeader("Content-Type", "text/plain; charset=UTF-8");

			//执行请求返回结果集
			CloseableHttpResponse response = client.execute(httpost);
			// 服务器返回码
			int status_code = response.getStatusLine().getStatusCode();
			//System.out.println(status_code);
			// 服务器返回内容

			HttpEntity responseEntity = response.getEntity();
			if (responseEntity != null) {
				respStr = EntityUtils.toString(responseEntity, "UTF-8");
			}
			System.out.println("respStr = " + respStr);
			// 释放资源
			EntityUtils.consume(responseEntity);
			client.close();
		} catch (Exception se) {
			se.printStackTrace();
		}
		return respStr;
	}
	
	/**
	 * 包体中是字符串。 
	 * @param baseUrl
	 * @param bodydata
	 * @return
	 */
	public static String postWithBodyString(String baseUrl, Map<String, Object> urlparam, String bodydata) {

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpost = new HttpPost(baseUrl);
		httpost.addHeader("Cache-Control", "max-age=0");
		httpost.setHeader("Connection", "close");

		URIBuilder builder = new URIBuilder().setPath(baseUrl);
		if (urlparam != null) {
			Iterator<Map.Entry<String, Object>> it = urlparam.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
				String name = entry.getKey();
				String val = entry.getValue().toString();
				builder.setParameter(name, val);
			}

		}

		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(5000).setConnectTimeout(5000)
				.setSocketTimeout(5000).build();

		httpost.setConfig(requestConfig);
		String respStr = null;
		try {
			//设置GET请求URL
			//System.out.println(builder.build());
			httpost.setURI(builder.build());
			//(new StringEntity(postData.toString(), HTTP.UTF_8)
			//StringEntity se = new StringEntity(bodydata);
			httpost.setEntity(new StringEntity(bodydata, HTTP.UTF_8));
			httpost.addHeader("Content-Type", "application/json;charset=utf-8");

			//执行请求返回结果集
			CloseableHttpResponse response = client.execute(httpost);
			// 服务器返回码
			int status_code = response.getStatusLine().getStatusCode();
			//System.out.println(status_code);
			// 服务器返回内容

			HttpEntity responseEntity = response.getEntity();
			if (responseEntity != null) {
				respStr = EntityUtils.toString(responseEntity, "UTF-8");
			}
			System.out.println("respStr = " + respStr);
			// 释放资源
			EntityUtils.consume(responseEntity);
			client.close();
		} catch (Exception se) {
			se.printStackTrace();
		}
		return respStr;
	}

	/**
	 * HTTP GET请求
	 * @param baseUrl 请求基本路径，即不带参数的路径
	 * @param paramList 参数集合
	 * @throws URISyntaxException 
	 */

	public static String getRequestResult(String baseUrl, Map<String, Object> paramMap, Map<String, Object> extheader)
			throws URISyntaxException {
		//创建httpclient实例，用于发送请求
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet();

		httpGet.addHeader("Cache-Control", "max-age=0");
		httpGet.setHeader("Connection", "close");

		URIBuilder builder = new URIBuilder(baseUrl);

		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(5000).setConnectTimeout(5000)
				.setSocketTimeout(5000).build();

		httpGet.setConfig(requestConfig);
		
		if (extheader != null) {
			Iterator<Map.Entry<String, Object>> it = extheader.entrySet().iterator();

			while (it.hasNext()) {
				Map.Entry<String, Object> en = it.next();
				httpGet.addHeader(en.getKey(), en.getValue().toString());
				//System.out.println (en.getKey()+":"+en.getValue().toString());
			}

		}

		//封装参数列表
		if (paramMap != null && paramMap.size() > 0) {
			List<NameValuePair> paramList = new ArrayList<NameValuePair>();
			NameValuePair nameValuePair = null;
			Iterator ite = paramMap.entrySet().iterator();
			while (ite.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) ite.next();
				nameValuePair = new BasicNameValuePair(entry.getKey(), entry.getValue());
				paramList.add(nameValuePair);
			}
			//追加参数
			builder.addParameters(paramList);
		}
		String respStr = null;
		try {
			//			//设置GET请求URL
			//			System.out.println(builder.build());
			//			System.out.println(builder.getScheme());
			//			System.out.println(builder.getUserInfo());
			//			System.out.println(builder.getHost());
			//			System.out.println(builder.getPath());
			//			System.out.println(builder.getQueryParams());
			//			System.out.println(builder.getFragment());
			//			System.out.println(builder.getCharset());
			URI url = builder.build();
			
			httpGet.setURI(url);
			//执行请求返回结果集
			CloseableHttpResponse response = client.execute(httpGet);
			// 服务器返回码
			//int status_code = response.getStatusLine().getStatusCode();
			//System.out.println(status_code);
			// 服务器返回内容
			
			HttpEntity responseEntity = response.getEntity();
			if (responseEntity != null) {
				respStr = EntityUtils.toString(responseEntity, "UTF-8");
			}
			System.out.println(baseUrl + "\trespStr = " + respStr);
			// 释放资源
			EntityUtils.consume(responseEntity);
			client.close();
		} catch (Exception se) {
			se.printStackTrace();
		}
		return respStr;
	}

	
	public static Header[] getRequestAndResultHeaders(String baseUrl, Map<String, Object> paramMap, Map<String, Object> extheader,String resultHeaderName,final StringBuilder res)
			throws URISyntaxException {
		//创建httpclient实例，用于发送请求
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet();

		httpGet.addHeader("Cache-Control", "max-age=0");
		httpGet.setHeader("Connection", "close");

		URIBuilder builder = new URIBuilder(baseUrl);

		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(5000).setConnectTimeout(5000)
				.setSocketTimeout(5000).build();

		httpGet.setConfig(requestConfig);

		if (extheader != null) {
			Iterator<Map.Entry<String, Object>> it = extheader.entrySet().iterator();

			while (it.hasNext()) {
				Map.Entry<String, Object> en = it.next();
				httpGet.addHeader(en.getKey(), en.getValue().toString());
				//System.out.println (en.getKey()+":"+en.getValue().toString());
			}

		}

		//封装参数列表
		if (paramMap != null && paramMap.size() > 0) {
			List<NameValuePair> paramList = new ArrayList<NameValuePair>();
			NameValuePair nameValuePair = null;
			Iterator ite = paramMap.entrySet().iterator();
			while (ite.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) ite.next();
				nameValuePair = new BasicNameValuePair(entry.getKey(), entry.getValue());
				paramList.add(nameValuePair);
			}
			//追加参数
			builder.addParameters(paramList);
		}
		String respStr = null;
		try {
			//			//设置GET请求URL
			//			System.out.println(builder.build());
			//			System.out.println(builder.getScheme());
			//			System.out.println(builder.getUserInfo());
			//			System.out.println(builder.getHost());
			//			System.out.println(builder.getPath());
			//			System.out.println(builder.getQueryParams());
			//			System.out.println(builder.getFragment());
			//			System.out.println(builder.getCharset());
			URI url = builder.build();

			httpGet.setURI(url);
			//执行请求返回结果集
			CloseableHttpResponse response = client.execute(httpGet);
			// 服务器返回码
			//int status_code = response.getStatusLine().getStatusCode();
			//System.out.println(status_code);
			// 服务器返回内容
			
			HttpEntity responseEntity = response.getEntity();
			if (responseEntity != null) {
				respStr = EntityUtils.toString(responseEntity, "UTF-8");
				if(res!=null){
					res.append(respStr);
				}
			}
			System.out.println(baseUrl + "\trespStr = " + respStr);
			// 释放资源
			EntityUtils.consume(responseEntity);
			//System.err.println(response.getAllHeaders());
			Header[] hds =null;
			if(resultHeaderName!=null){
				hds = response.getHeaders(resultHeaderName);
			}else{
				hds = response.getAllHeaders();
			}
			client.close();
			return hds;
		} catch (Exception se) {
			se.printStackTrace();
		}
		return null;
	}
	/**
	 * HTTP POST请求
	 * @param baseUrl 请求基本路径，即不带参数的路径
	 * @param paramList 参数集合
	 */
	public static String postRequestResult(String baseUrl, HashMap<String, Object> paramMap,
			Map<String, Object> extheader) {
		//创建httpclient实例，用于发送请求
		CloseableHttpClient client = HttpClients.createDefault();
		// 服务器返回内容
		String respStr = null;
		//创建post请求

		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(5000).setConnectTimeout(5000)
				.setSocketTimeout(5000).build();

		HttpPost httpPost = new HttpPost(baseUrl);
		httpPost.addHeader("Cache-Control", "max-age=0");
		httpPost.setHeader("Connection", "close");

		httpPost.setConfig(requestConfig);

		if (extheader != null) {
			Iterator<Map.Entry<String, Object>> it = extheader.entrySet().iterator();

			while (it.hasNext()) {
				Map.Entry<String, Object> en = it.next();
				httpPost.addHeader(en.getKey(), en.getValue().toString());
				System.out.println(en.getKey() + ":" + en.getValue().toString());
			}

		}
		try {
			//封装参数列表
			if (paramMap != null && paramMap.size() > 0) {
				List<NameValuePair> paramList = new ArrayList<NameValuePair>();
				NameValuePair nameValuePair = null;
				Iterator ite = paramMap.entrySet().iterator();
				while (ite.hasNext()) {
					Map.Entry<String, Object> entry = (Map.Entry<String, Object>) ite.next();
					nameValuePair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
					paramList.add(nameValuePair);
				}
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList, "UTF-8");
				httpPost.setEntity(entity);

			}
			//执行请求返回结果集
			CloseableHttpResponse response = client.execute(httpPost);
			// 服务器返回码
			int status_code = response.getStatusLine().getStatusCode();
			System.out.println(status_code);
			if (status_code == 200) {
				HttpEntity responseEntity = response.getEntity();
				if (responseEntity != null) {
					respStr = EntityUtils.toString(responseEntity, "UTF-8");
				}
				EntityUtils.consume(responseEntity);
			}
			System.out.println("respStr = " + respStr);
			// 释放资源

		} catch (Exception e) {
			respStr = null;
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();//关闭连接
			try {
				client.close();
			} catch (Exception se) {
			}
		}

		return respStr;
	}

	public static void main(String[] args) throws Exception {
		//https://hihocoder.com/partner/Lanqiao/ContestResult?class=lanqiaoacmhw1&account=stu2000@lanqiao.org   这
		Map<String, Object> paramMap = new HashMap<String, Object>();
		String baseUrl = "https://hihocoder.com/partner/Lanqiao/ContestResult";
		paramMap.put("key", "lanqiaoacmhw1");
		paramMap.put("location", "stu0186@lanqiao.org");
		paramMap.put("radius", "200");
		paramMap.put("output", "json");
		paramMap.put("poitype", "商务住宅|汽车服务|汽车销售|汽车维修|餐饮服务");
		paramMap.put("location", "stu0186@lanqiao.org");
		/*HashMap<String, Object> extheader = new HashMap<String, Object>();
		extheader.put("Authorization", "EX7MLK");
		String str = HttpClientUtil.getRequestResult(baseUrl, paramMap, extheader);
		*/
		String str = HttpClientUtil.getRequestResult(baseUrl, paramMap, null);
		Gson son = new Gson();
		HashMap mp = son.fromJson(str, HashMap.class);
		//WebUtil.printMap(mp);
		ArrayList<Map> list = (ArrayList<Map>) mp.get("qulist");
		for (Map m : list) {
			//WebUtil.printMap(m);
			float f = Float.parseFloat(m.get("quscore").toString());

			String s = m.get("qucontent").toString();
			System.out.println(f + ":" + s);
		}
		System.out.println(str);
	}
}