/**   
 * 
 * @Title: PhoneNumberUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午3:42:07 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName: PhoneNumberUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月7日 下午3:42:07  
 */
public class PhoneNumberUtils {

	/**
	 * 
	 * @Title: isPhoneNumber 
	 * @Description: 测试手机号是否合法
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isPhoneNumber(String str){
		/*String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		boolean find = matcher.find();*/
		
		return Pattern.matches("^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$",str);
	}
	
}
