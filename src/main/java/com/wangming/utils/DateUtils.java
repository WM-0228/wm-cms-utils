/**   
 * 
 * @Title: DateUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午4:23:19 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.Date;

/** 
 * @ClassName: DateUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月7日 下午4:23:19  
 */
public class DateUtils {

	/**
	 * 
	 * @Title: compare 
	 * @Description: 比较两个日期大小
	 * @param date1
	 * @param date2
	 * @return
	 * @return: int
	 */
	public static int compare(Date date1,Date date2){
		if(date1 != null || date2 != null)
			//自定义错误
			throw new RuntimeException("参数不能为空");
			
		return date1.compareTo(date2);
	}
	
}
