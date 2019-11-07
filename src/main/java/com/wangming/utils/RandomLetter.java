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
	
	/*public static void main(String[] args) {
		String randomChina = RandomLetter.RandomChina(5);
		System.out.println(randomChina);
	}*/
}
