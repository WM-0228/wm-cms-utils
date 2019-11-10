/**   
 * 
 * @Title: getAgeUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019��11��8�� ����9:18:35 
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
 * @date: 2019��11��8�� ����9:18:35  
 */
public class getAgeOrDateUtils {

	//һ���ж��ٺ���
	static final long millionSecondsPerDay = 1000*60*60*24;
	
	/**
	 * 
	 * @Title: getAge 
	 * @Description: �������ռ�������
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAge(Date birthday){
		Calendar now = Calendar.getInstance();
		//����ǰϵͳʱ�����Calendar����,���ڼ���
		//��������ʱ�����óɴ�����ʱ��
		now.setTime(new Date());
		
		//����Calendar�洢�û�������Ϣ
		Calendar bir = Calendar.getInstance();
		bir.setTime(birthday);
		
		//�������  ��������洢
		int age;
		if(bir.after(now)){
			throw new RuntimeException("Please enter the correct date of birth");
		}else{
			age = now.get(Calendar.YEAR) - bir.get(Calendar.YEAR);
			//���㵱ǰϵͳʱ�������  > �û��������յ�ʱ���ڵ�ǰ��ݵ�����
			if(now.get(Calendar.DAY_OF_YEAR) > bir.get(Calendar.DAY_OF_YEAR)){
				age += 1;
			}
		}
		return age;
	}
	
	/**
	 * 
	 * @Title: remainDays 
	 * @Description: δ����ĳһ��
	 * @param futrueDate
	 * @return
	 * @return: int
	 */
	public static int remainDays(Date futrueDate){
		//���������Ƿ���δ��ʱ��  �������С�ڵ�ǰ���� �ͻ� <0
		if(futrueDate.compareTo(new Date()) < 0)
			throw new RuntimeException("The future date cannot be less than the current date");
		
		//�����ж�����
		int days = (int)((futrueDate.getTime() - new Date().getTime()) / millionSecondsPerDay);
		
		return days;
	}
	
	/**
	 * 
	 * @Title: isNowDay 
	 * @Description: �ж��Ƿ��ǽ���
	 * @param date
	 * @return
	 * @return: boolean
	 */
	public static boolean isNowDay(Date date){

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// ��ȡ���ڵ��ַ���
		String dateStr = sdf.format(date);

		// ��ȡ���ڵ��ַ���
		String todayStr = sdf.format(new Date());

		return (dateStr.equals(todayStr));
	}
	
	/**
	 * 
	 * @Title: getEOM 
	 * @Description: �����³�ʱ���ȡ����ĩʱ��
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEOM(Date date) {
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			//add�����Ǹ�����������,��ָ����ʱ��	����ӻ��ȥ�����������ֶ�
			calendar.add(Calendar.MONTH, 1);
			// set�����ǽ������������ֶ����ó�ָ����ֵ
			calendar.set(Calendar.HOUR, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.add(Calendar.SECOND, -1);
	
			return calendar.getTime();
			
		}
	
	/**
	 * 
	 * @Title: isThisWeek 
	 * @Description: �ж��Ƿ��ڱ���
	 * @param date
	 * @return
	 * @return: boolean
	 */
	public static boolean isThisWeek(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		Calendar firstDayOfWeek = Calendar.getInstance(Locale.getDefault());

		firstDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		int day = firstDayOfWeek.get(Calendar.DAY_OF_WEEK);

		firstDayOfWeek.add(Calendar.DATE, -day + 1 + 1);// �����+1����Ϊ�����տ�ʼ

		// ����һ������

		System.out.println(format.format(firstDayOfWeek.getTime()));

		Calendar lastDayOfWeek = Calendar.getInstance(Locale.getDefault());

		lastDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		day = lastDayOfWeek.get(Calendar.DAY_OF_WEEK);

		lastDayOfWeek.add(Calendar.DATE, 7 - day + 1);

		// ���������������

		System.out.println(format.format(lastDayOfWeek.getTime()));

		return (date.getTime() < lastDayOfWeek.getTime().getTime()
				&& date.getTime() > firstDayOfWeek.getTime().getTime());

	}

	/**
	 * 
	 * @Title: initDate 
	 * @Description: 3.4.7����ʱ����󣬳�ʼ�������³���1��0ʱ0��0��0����
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
	* ����2��(10��)
	* ������һ��ʱ����󣬷��ظ�ʱ�������µ������23ʱ59��59�룬��Ҫ�����´���С�Ͷ������������
	* ����һ��Date�����ֵ��2019-05-18 11:37:22���򷵻ص�ʱ��Ϊ2019-05-31 23:59:59
	* ����һ��Date�����ֵ��2019-02-05 15:42:18���򷵻ص�ʱ��Ϊ2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
	//TODO ʵ�ִ���
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
