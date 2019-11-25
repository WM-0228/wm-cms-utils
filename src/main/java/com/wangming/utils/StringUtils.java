/**   
 * 
 * @Title: StringUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019��11��7�� ����3:06:11 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName: StringUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019��11��7�� ����3:06:11  
 */
public class StringUtils {

	/**
	 * 
	 * @Title: isBlank 
	 * @Description: �ж��ַ����Ƿ�Ϊ��
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isBlank(String str){
		return null == str || str.trim().length() <= 0;
	}
	
	/**
	 * 
	 * @Title: haveValue 
	 * @Description: �ж��ַ����Ƿ�ǿ�
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean haveValue(String str){
		return !(null == str || str.trim().length() <= 0);
	}

	//判断传入的字符串是否为以http打头的url地址
	public static boolean isHttpUrl(String urls){
		//TODO 实现判断传入的字符串是否为以http打头的url地址
		boolean isurl = false;
        String regex = "(((https|http)?://)?([a-z0-9]+[.])|(www.))"
            + "\\w+[.|\\/]([a-z0-9]{0,})?[[.]([a-z0-9]{0,})]+((/[\\S&&[^,;\u4E00-\u9FA5]]+)+)?([.][a-z0-9]{0,}+|/?)";//设置正则表达式
 
        Pattern pat = Pattern.compile(regex.trim());//对比
        Matcher mat = pat.matcher(urls.trim());
        isurl = mat.matches();//判断是否匹配
        if (isurl) {
            isurl = true;
        }
        return isurl;

		
	}
	
	/**
	 * 验证是否是URL
	 * @param url
	 * @return
	 */
	public static boolean isUrl(String str){
		
		 //转换为小写
        str = str.toLowerCase();
        String regex = "^((https|http|ftp|rtsp|mms)?://)"  //https、http、ftp、rtsp、mms
                + "?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?" //ftp的user@  
               + "(([0-9]{1,3}\\.){3}[0-9]{1,3}" // IP形式的URL- 例如：199.194.52.184               
                 + "|" // 允许IP和DOMAIN（域名） 或单域名
                 + "[0-9a-z]*"  // 或单域名
                 + "|" // 允许IP和DOMAIN（域名） 或单域名
                 + "([0-9a-z_!~*'()-]+\\.)*" // 域名- www.  
                 + "([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\." // 二级域名  
                + "[a-z]{2,6})" // first level domain- .com or .museum  
                + "(:[0-9]{1,5})?" // 端口号最大为65535,5位数
                + "((/?)|" // a slash isn't required if there is no file name  
                + "(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$";  
        return  str.matches(regex);	
	}
}
