/**   
 * 
 * @Title: FileUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午7:06:03 
 * @version: V1.0   
 */
package com.wangming.utils;

import java.io.File;
import java.util.Properties;

/** 
 * @ClassName: FileUtils 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月7日 下午7:06:03  
 */
public class FileUtils {

	/**
	 * 
	 * @Title: getFileSuffix 
	 * @Description: 返回指定文件的后缀
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getFileSuffix(String fileName){
		if(null != fileName && fileName.length() != 0)
		return fileName.substring(fileName.lastIndexOf("."));
		return "请输入有效文件";
	}
	
	/**
	 * 
	 * @Title: getSystemDirectory 
	 * @Description: 返回操作系统的临时directory
	 * @return
	 * @return: File
	 */
	public static File getSystemDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	
}
