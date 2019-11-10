/**   
 * 
 * @Title: getAgeUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月8日 上午9:18:35 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/** 
 * @ClassName: getAgeUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月8日 上午9:18:35  
 */
public class getAgeOrDateUtils {

	//一天有多少毫秒
	static final long millionSecondsPerDay = 1000*60*60*24;
	
	/**
	 * 
	 * @Title: getAge 
	 * @Description: 根据生日计算年龄
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAge(Date birthday){
		Calendar now = Calendar.getInstance();
		//将当前系统时间存入Calendar类中,用于计算
		//将给定的时间设置成次日历时间
		now.setTime(new Date());
		
		//创建Calendar存储用户生日信息
		Calendar bir = Calendar.getInstance();
		bir.setTime(birthday);
		
		//定义变量  用于年龄存储
		int age;
		if(bir.after(now)){
			throw new RuntimeException("Please enter the correct date of birth");
		}else{
			age = now.get(Calendar.YEAR) - bir.get(Calendar.YEAR);
			//计算当前系统时间的天数  > 用户输入生日的时间在当前年份的天数
			if(now.get(Calendar.DAY_OF_YEAR) > bir.get(Calendar.DAY_OF_YEAR)){
				age += 1;
			}
		}
		return age;
	}
	
	/**
	 * 
	 * @Title: remainDays 
	 * @Description: 未来的某一天
	 * @param futrueDate
	 * @return
	 * @return: int
	 */
	public static int remainDays(Date futrueDate){
		//计算日期是否是未来时间  如果日期小于当前日期 就会 <0
		if(futrueDate.compareTo(new Date()) < 0)
			throw new RuntimeException("The future date cannot be less than the current date");
		
		//计算有多少天
		int days = (int)((futrueDate.getTime() - new Date().getTime()) / millionSecondsPerDay);
		
		return days;
	}
	
	/**
	 * 
	 * @Title: isNowDay 
	 * @Description: 判断是否是今天
	 * @param date
	 * @return
	 * @return: boolean
	 */
	public static boolean isNowDay(Date date){

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// 获取日期的字符串
		String dateStr = sdf.format(date);

		// 获取日期的字符串
		String todayStr = sdf.format(new Date());

		return (dateStr.equals(todayStr));
	}
	
	/**
	 * 
	 * @Title: getEOM 
	 * @Description: 根据月初时间获取到月末时间
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEOM(Date date) {
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			//add方法是根据日历规则,将指定的时间	量添加或减去给定日历的字段
			calendar.add(Calendar.MONTH, 1);
			// set方法是将给定的日历字段设置成指定的值
			calendar.set(Calendar.HOUR, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.add(Calendar.SECOND, -1);
	
			return calendar.getTime();
			
		}
	
	/**
	 * 
	 * @Title: isThisWeek 
	 * @Description: 判断是否在本周
	 * @param date
	 * @return
	 * @return: boolean
	 */
	public static boolean isThisWeek(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		Calendar firstDayOfWeek = Calendar.getInstance(Locale.getDefault());

		firstDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		int day = firstDayOfWeek.get(Calendar.DAY_OF_WEEK);

		firstDayOfWeek.add(Calendar.DATE, -day + 1 + 1);// 后面的+1是因为从周日开始

		// 本周一的日期

		System.out.println(format.format(firstDayOfWeek.getTime()));

		Calendar lastDayOfWeek = Calendar.getInstance(Locale.getDefault());

		lastDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		day = lastDayOfWeek.get(Calendar.DAY_OF_WEEK);

		lastDayOfWeek.add(Calendar.DATE, 7 - day + 1);

		// 本周星期天的日期

		System.out.println(format.format(lastDayOfWeek.getTime()));

		return (date.getTime() < lastDayOfWeek.getTime().getTime()
				&& date.getTime() > firstDayOfWeek.getTime().getTime());

	}

	/**
	 * 
	 * @Title: initDate 
	 * @Description: 3.4.7给定时间对象，初始化到该月初的1日0时0分0秒0毫秒
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date initDate(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);

		return calendar.getTime();
	}
	
	
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
	//TODO 实现代码
		Calendar c =  Calendar.getInstance();
		c.setTime(src);
		c.add(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
}
