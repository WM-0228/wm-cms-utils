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

/** 
 * @ClassName: StringUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019��11��7�� ����3:06:11  
 */
public class StringUtils {

	public static boolean isBlank(String str){
		return null == str || str.trim().length() <= 0;
	}
	
}
