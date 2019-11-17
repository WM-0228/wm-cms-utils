/**   
 * 
 * @Title: WeekUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月11日 上午9:24:20 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/** 
 * @ClassName: WeekUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月11日 上午9:24:20  
 */
public class WeekUtils {

	public static boolean isEmpty(Collection<?> src) throws Exception{
//		 return src == null || src.isEmpty();
		int i = 0;
		int j = 0;
		Field[] declaredFields = null;
		if(src != null && src.size() != 0){
			for (Object object : src) {
				Class clazz = object.getClass();
				declaredFields = clazz.getDeclaredFields();
				for (Field field : declaredFields) {
					field.setAccessible(true);
					j++;
					if(null == field.get(object)){
						i++;
						System.out.println(i);
					}
				}
			}
		}
		if(j == i){
			return false;
		}
		return true;
	}
	
	
	public static boolean isNumber(String num){
		return Pattern.matches("[0-9\\.]+",num);
	}
	
	public static void main(String[] args) {
		/*List<String> l = new ArrayList<String>();
		l.add("");
		l.add("");
		boolean empty = WeekUtils.isEmpty(l);
		System.out.println(empty);*/
		
		/*boolean blank = StringUtils.isBlank("asd");
		System.out.println(blank);*/
		
		boolean number = WeekUtils.isNumber("2.2");
		System.out.println(number);
	}
}
