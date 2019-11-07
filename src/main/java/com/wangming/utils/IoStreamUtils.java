/**   
 * 
 * @Title: IoStreamUtils.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.utils 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月7日 下午7:19:41 
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
 * @date: 2019年11月7日 下午7:19:41  
 */
public class IoStreamUtils {

	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 批量关闭流对象,参数也能传无限个
	 * AutoCloseable 是一个可以保存资源的对象,直到他关闭
	 * AutoCloseable对象的close()方法在退出已在资源规范头中声明对象的try -with-resources块时自动调用。 
	 * 这种结构确保迅速释放，避免资源耗尽异常和可能发生的错误。 
	 * @param ables
	 * @return: void
	 */
	//参数的...代表可以 任意数量的参数
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
	 * @Description: 读取文本文件内容和设置utf-8并且使用批量关闭流对象方法进行关闭
	 * @return
	 * @return: String
	 */
	public static String readFileContents(InputStream src){
		//字节输出流
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
		//关流
		closeAll(out,src);
		return str;
		
	}
	
	/**
	 * 
	 * @Title: readFileContents 
	 * @Description: 传入文本对象,返回该文件内容,并且要求内部调用第二个方法
	 * 这是典型的方法的重载   记住  少年!!!!!
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
