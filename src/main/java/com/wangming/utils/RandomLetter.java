/**   
 * 
 * @Title: Randomletter.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019��11��7�� ����3:58:33 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

/** 
 * @ClassName: Randomletter 
 * @Description: TODO
 * @author:WM 
 * @date: 2019��11��7�� ����3:58:33  
 */
public class RandomLetter {

	/**
	 * 
	 * @Title: randomletter 
	 * @Description: ָ���������������ַ���
	 * @param n
	 * @return
	 * @return: String
	 */
	public static String randomLetter(int n){
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			sb.append((char)('A' + random.nextInt(26)));
		}
		
		return sb.toString();
	}
	
	/**
	 * 
	 * @Title: RandomChina 
	 * @Description: ��ȡ�������
	 * @return
	 * @return: char
	 */
	public static char RandomChina(){
		String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("����");
        }

        	return str.charAt(0);
	}
	
	/**
	 * 
	 * @Title: RandomChina 
	 * @Description: ָ����������ĺ���
	 * @param n
	 * @return
	 * @return: String
	 */
	public static String RandomChina(int n){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(RandomChina());
		}
		return sb.toString();
	}
	
	public static String RandomName(){
		int a = (int) (Math.random() * 10);
		return new RandomLetter().RandomChina((a >= 4 ? 3 : (a == 0 ? 2 : a)));
	}
	
	public static String randomChineseString(){
		Random ran = new Random();
		int nextInt = ran.nextInt(20)+20;
		return RandomChina(nextInt);
	}
	
	public static int RandomUtil(){
		Random ran = new Random();
		return	(100000 + (ran.nextInt(99990000) * 10));
	}
	
	public static String RandomUtil(String num){
		return	num + 1000 + (int)(Math.random() * 10000000);
	}
	
	public static int RandomNum(){
		Random ran = new Random();
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
		return	ran.nextInt(arr.length);
	}
	
	public static Date randomHireday1() {
		int startYear=1950;
		int endYear=2019;
		int year = (int)(Math.random()*(endYear-startYear+1))+startYear;	//随机年
		int month= (int)(Math.random()*12)+1;								//随机月
		Calendar c = Calendar.getInstance();				//创建Calendar对象
		c.set(year, month, 0);								//设定日期
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);		//获取对应年月有几天
		int day=(int)(Math.random()*dayOfMonth+1)	;		//产生随机日
		Date hireday=Date.valueOf(year+"-"+month+"-"+day);	//通过valueOf方法生成Date对象
		return hireday;
	}
	
	public static Date randomHireday2() {
		int startYear=1950;
		int endYear=2019;
		int year = (int)(Math.random()*(endYear-startYear+1))+startYear;	//随机年
		int month= (int)(Math.random()*12)+1;								//随机月
		Calendar c = Calendar.getInstance();				//创建Calendar对象
		c.set(year, month, 0);								//设定日期
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);		//获取对应年月有几天
		int day=(int)(Math.random()*dayOfMonth+1)	;		//产生随机日
		Date hireday=Date.valueOf(year+"-"+month+"-"+day);	//通过valueOf方法生成Date对象
		c.setTime(hireday);
		c.add(Calendar.YEAR, 50);
		java.util.Date time = c.getTime();
		return new Date(time.getTime()) ;
	}
	
	
	/*public static void main(String[] args) {
		String randomChina = RandomLetter.RandomChina(5);
		System.out.println(randomChina);
	}*/
}
