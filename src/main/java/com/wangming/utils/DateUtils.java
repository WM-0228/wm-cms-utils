/**   
 * 
 * @Title: DateUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019��11��7�� ����4:23:19 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.Date;

/** 
 * @ClassName: DateUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019��11��7�� ����4:23:19  
 */
public class DateUtils {

	/**
	 * 
	 * @Title: compare 
	 * @Description: �Ƚ��������ڴ�С
	 * @param date1
	 * @param date2
	 * @return
	 * @return: int
	 */
	public static int compare(Date date1,Date date2){
		if(date1 != null || date2 != null)
			//�Զ������
			throw new RuntimeException("��������Ϊ��");
			
		return date1.compareTo(date2);
	}
	
}
