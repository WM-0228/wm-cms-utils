/**   
 * 
 * @Title: IoStreamUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019��11��7�� ����7:19:41 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/** 
 * @ClassName: IoStreamUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019��11��7�� ����7:19:41  
 */
public class IoStreamUtils {

	/**
	 * 
	 * @Title: closeAll 
	 * @Description: �����ر�������,����Ҳ�ܴ����޸�
	 * AutoCloseable ��һ�����Ա�����Դ�Ķ���,ֱ�����ر�
	 * AutoCloseable�����close()�������˳�������Դ�淶ͷ�����������try -with-resources��ʱ�Զ����á� 
	 * ���ֽṹȷ��Ѹ���ͷţ�������Դ�ľ��쳣�Ϳ��ܷ����Ĵ��� 
	 * @param ables
	 * @return: void
	 */
	//������...������� ���������Ĳ���
	public static void closeAll(AutoCloseable ... ables){
		if(ables.length != 0){
			for (AutoCloseable autoCloseable : ables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 
	 * @Title: readFileContents 
	 * @Description: ��ȡ�ı��ļ����ݺ�����utf-8����ʹ�������ر������󷽷����йر�
	 * @return
	 * @return: String
	 */
	public static String readFileContents(InputStream src){
		//�ֽ������
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] bt = new byte[1024];
		String str = null;
		int x = 0;
		try {
			while((x = src.read(bt)) != -1){
					out.write(bt);
			}
			str = out.toString("utf-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����
		closeAll(out,src);
		return str;
		
	}
	
	/**
	 * 
	 * @Title: readFileContents 
	 * @Description: �����ı�����,���ظ��ļ�����,����Ҫ���ڲ����õڶ�������
	 * ���ǵ��͵ķ���������   ��ס  ����!!!!!
	 * @param txtFile
	 * @return
	 * @return: String
	 */
	public static String readFileContents(File txtFile){
		try {
			return readFileContents(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
