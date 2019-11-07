/**   
 * 
 * @Title: EmailUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午3:52:58 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName: EmailUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月7日 下午3:52:58  
 */
public class EmailUtils {

	/**
	 * 
	 * @Title: isEmail 
	 * @Description: 判断邮箱是否合法
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmail(String str){
		/*String regex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		boolean find = matcher.find();*/
		return Pattern.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", str);
	}
}
