/**   
 * 
 * @Title: Randomletter.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午3:58:33 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.util.Random;

/** 
 * @ClassName: Randomletter 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月7日 下午3:58:33  
 */
public class RandomLetter {

	/**
	 * 
	 * @Title: randomletter 
	 * @Description: 指定次数的随机组合字符串
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
	 * @Description: 获取随机中文
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
            System.out.println("错误");
        }

        	return str.charAt(0);
	}
	
	/**
	 * 
	 * @Title: RandomChina 
	 * @Description: 指定随机次数的汉字
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
	
	/*public static void main(String[] args) {
		String randomChina = RandomLetter.RandomChina(5);
		System.out.println(randomChina);
	}*/
}
