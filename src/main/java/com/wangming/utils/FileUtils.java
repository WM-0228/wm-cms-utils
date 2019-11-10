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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
	
	
	/**
	 * 
	 * @Title: readFile 
	 * @Description: ��ȡ���ݷ����ַ�������
	 * @param fileName
	 * @return
	 * @throws IOException
	 * @return: List<String>
	 */
	public static List<String> readFile(String fileName) throws IOException{
		List<String> lines =  new ArrayList<String>();
		
		File file = new File(fileName);
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(file),"UTF-8")
				);
		
		String str = null;
		while((str=reader.readLine())!=null) {
			lines.add(str);
		}
		return lines;
	}
	
}
