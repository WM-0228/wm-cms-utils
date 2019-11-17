/**   
 * 
 * @Title: WeekTest.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.test 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月11日 上午9:34:58 
 * @version: V1.0   
 */
package com.wangming.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.wangming.utils.StringUtils;
import com.wangming.utils.WeekUtils;

/** 
 * @ClassName: WeekTest 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月11日 上午9:34:58  
 */
public class WeekTest {

	/**
	 * 
	 * @Title: ConTest 
	 * @Description: 判断List、Set之类的对象是否有值
	 * 有值返回false
	 * 没有值或为空返回true
	 * @return: void
	 */
	@Test
	public void ConTest(){
		/*List<String> list1 = new ArrayList<String>();
		list1.add("asd");
		list1.add("123");
		//测试成功一次
		boolean empty = WeekUtils.isEmpty(list1);
		System.out.println(empty);
		
		//测试失败一次
		List<String> list2 = new ArrayList<String>();
		list2.add("");
		list2.add("");
		boolean empty2 = WeekUtils.isEmpty(list2);*/
		try {
			List<User> u = new ArrayList<User>();
			u.add(new User(null,null));
			u.add(new User(null,null));
			boolean empty2 = WeekUtils.isEmpty(u);
			System.out.println(empty2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @Title: NumberTest 
	 * @Description: 测试是否是数字小数点也算
	 * 不是数字返回false
	 * 是数字返回true
	 * @return: void
	 */
	@Test
	public void NumberTest(){
		boolean number = WeekUtils.isNumber("adsas");
		System.out.println(number);
		
		boolean number2 = WeekUtils.isNumber("123.5");
		System.out.println(number2);
	}
	
	/***
	 * 
	 * @Title: StringTest 
	 * @Description: 判断源字符串是否有值
	 * 空串返回true
	 * 非空返回false
	 * @return: void
	 */
	@Test
	public void StringTest(){
		boolean blank = StringUtils.isBlank("");
		System.out.println(blank);
		
		boolean blank2 = StringUtils.isBlank("asd");
		System.out.println(blank2);
	}
}
