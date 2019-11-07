/**   
 * 
 * @Title: FileUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019��11��7�� ����7:06:03 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.io.File;
import java.util.Properties;

/** 
 * @ClassName: FileUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019��11��7�� ����7:06:03  
 */
public class FileUtils {

	/**
	 * 
	 * @Title: getFileSuffix 
	 * @Description: ����ָ���ļ��ĺ�׺
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getFileSuffix(String fileName){
		if(null != fileName && fileName.length() != 0)
		return fileName.substring(fileName.lastIndexOf("."));
		return "��������Ч�ļ�";
	}
	
	/**
	 * 
	 * @Title: getSystemDirectory 
	 * @Description: ���ز���ϵͳ����ʱdirectory
	 * @return
	 * @return: File
	 */
	public static File getSystemDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
}
