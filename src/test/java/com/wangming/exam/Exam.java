/**   
 * 
 * @Title: Exam.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.exam 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月12日 上午8:10:24 
 * @version: V1.0   
 */
package com.wangming.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** 
 * @ClassName: Exam 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月12日 上午8:10:24  
 */
public class Exam {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("sex","nan");
		map.put("id","yi");
		map.put("name","wang");
		map.put("name1","wang");
		map.put("bir","fdfg");
		map.put("bir1","fdfg");
		map.put("bir3","fdfg");
		map.put("bir4","fdfg");
		map.put("bir2","fdfg");
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(map.get(string).hashCode());
			System.out.println();
		}
		
		map.forEach((k,v) -> System.out.println("第二种遍历方式="+k+","+v));
	}
}
