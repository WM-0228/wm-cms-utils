/**   
 * 
 * @Title: LambdaTest.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.test 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月11日 下午2:10:40 
 * @version: V1.0   
 */
package com.wangming.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.Test;


/** 
 * @ClassName: LambdaTest 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月11日 下午2:10:40  
 */
public class LambdaTest {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		list.add("asd");
		list.add("gfh");
		list.add("yutr");
		//集合循环方式
		list.forEach(System.out::println);
		list.forEach(a -> System.out.println(a));*/
		char t = 99;
		System.out.println(t);
	}
	
//	@Test
//	public void File(){
//		List<String> list = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
//		System.out.println("Languages which starts with J :");
//		filter(list, (str)->str.endsWith("J"));
//	}
	
	/**
	 * 
	 * @Title: filter 
	 * @Description: 无參的表达式调用
	 * @return: void
	 */
	@Test
	public void filter() {
		Runnable r = () -> {System.out.println("Lambda表达式");
			System.out.println("asdas");
		};
		r.run();
		
	}
	
	/**
	 * 
	 * @Title: TestConsumer 
	 * @Description: 有參的表达式调用
	 * 如果参数只有一个   括号可以省略
	 * @return: void
	 */
	@Test
	public void TestConsumer(){
		Consumer<String> c = t -> System.out.println(t.replace("z", "111"));
		c.accept("asdz");
	}
	
	@Test
	public void TestComparator(){
		Comparator<Integer> c = (x,y) -> {
			System.out.println("这是一个比大小的接口");
			return Integer.compare(x, y);
		};
		
		int compare = c.compare(3,4);
		System.out.println(compare);
	}
	
	/**
	 * 
	 * @Title: MapTest 
	 * @Description: hashMap循环
	 * @return: void
	 */
	@Test
	public void MapTest(){
		Map map = new HashMap();
		map.put("name","张三");
		map.put("sex","男");
		map.put("age","14");
		map.forEach((k,v) -> System.out.println("key="+k+",value="+v));
	}
	
	@Test
	public void LambdaInterfaceTest(){
		int demo = Demo(5,x -> x * x);
		System.out.println(demo);
	}
	
	public int Demo(Integer num,LambdaInterface lf){
		return lf.count(num);
	} 
}
