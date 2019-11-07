/**   
 * 
 * @Title: StringUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午3:06:11 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.regex.Pattern;

/** 
 * @ClassName: StringUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月7日 下午3:06:11  
 */
public class StringUtils {

	/**
	 * 
	 * @Title: isBlank 
	 * @Description: 判断字符串是否为空
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
	 * @Description: 判断字符串是否非空
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean haveValue(String str){
		return !(null == str || str.trim().length() <= 0);
	}
	
}
