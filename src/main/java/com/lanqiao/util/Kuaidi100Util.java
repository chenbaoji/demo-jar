package com.lanqiao.util;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.apache.commons.lang3.StringUtils;

import com.lanqiao.common.Result;
/**
 * 快递100方法.
 * @author Acci.
 * 2020年5月12日.
 */
public class Kuaidi100Util {
	public final static Map<String,String> stateMap=new HashMap<String, String>();
	static {
		//0在途，1揽收，2疑难，3签收，4退签，5派件，6退回，7转单，10待清关，11清关中，12已清关，13清关异常，14收件人拒签
		String ss="0:在途，1:揽收，2:疑难，3:签收，4:退签，5:派件，6:退回，7:转单，10:待清关，11:清关中，12:已清关，13:清关异常，14:收件人拒签";
		String[] split = ss.split("，");
		for (String str : split) {
			String[] sp = str.split(":");
			stateMap.put(sp[0], sp[1]);
		}
	}
	/** 
	 * 查询快递状态.
	 * @param postid 快递编号
	 * @param com 快递公司
	 * @param phone 手机或固定电话,顺丰单号必填!!其它单号无需填写
	 * 
	 */
	public static Result query(final String postid,final String com,final String phone){
		final String host="https://m.kuaidi100.com";
		String url=host+"/query?" + ("coname=lanqiao&type="+com+"&postid="+postid+"&temp=" + Math.random() );
		
		if(StringUtils.equals("shunfeng", com)){
			url=url+"&phone="+NullUtil.getString(phone);
		}
		Map<String, Object> extheader=new HashMap<String, Object>();
		extheader.put("Accept", "application/json, text/javascript, */*; q=0.01");
		//extheader.put("Cookie", Cookie);
		extheader.put("Host", "m.kuaidi100.com");
		extheader.put("Origin", host);
		extheader.put("Referer",host+"/app/query/?coname=lanqiao&nu="+postid+"&com="+com+"&phone="+NullUtil.getString(phone) );
		extheader.put("Sec-Fetch-Mode", "cors");
		extheader.put("Sec-Fetch-Site", "same-origin");
		extheader.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36");
		extheader.put("X-Requested-With", "XMLHttpRequest");
		
		try {
			String requestResult = HttpClientUtil.getRequestResult(url, null, extheader);
			Result result=RefUtil.jsonToObj(requestResult, Result.class);
			if(result.getData("state")!=null){
				if(stateMap.containsKey(result.getData("state"))){
					result.addData("stateStr",stateMap.get(result.getData("state")));
				}
			}
			//成功判定?
			if(StringUtils.equals(result.getData("status")+"", "200")){
				result.setCode(200);
			}
			return result;
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Result.fail(-1, "获取失败");
		}
	}
	
	//快递100查询使用示例
	public static void main(String[] args) {	
		Result res = Kuaidi100Util.query("75346643765836", "zhongtong","");
		//Result res = Kuaidi100Util.query("SF6090324424673", "shunfeng","15359393375"); //顺丰专用
		System.err.println(res.getData("stateStr")); //快递状态
		List<Map> arrays = (List)res.getData("data"); //快递详情
		for (Map map : arrays) {
			System.err.println("=========");
			System.err.println(map.get("context")); //内容
			System.err.println(map.get("ftime")); //格式化后时间
			System.err.println(map.get("location")); //地址
			System.err.println(map.get("time")); //时间，原始格式
			
		}		
	}
}
