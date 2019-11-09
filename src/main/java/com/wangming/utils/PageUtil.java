//package com.wangming.utils;
//
//import java.lang.reflect.Field;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//
///**
// * ��ҳ������
// *  
// */
//public final class PageUtil {
//	
//	
//	
//	/**
//	 * ��ҳ����ʾ
//	 * @param request 
//	 * @param url      �����mapping·��
//	 * @param pageSize ÿҳ��ʾ����������
//	 * @param list     ��ʾ��list����
//	 * @param listCount һ���ж���������
//	 * @param page     ��ǰҳ��
//	 */
//	public static void page(HttpServletRequest request, String url, Integer pageSize, List<?> list, Integer listCount, Integer pageNum,Class clazz,Object obj) {
//		// ͨ������Ҫ�����������ҳ����ʾ����������ҳ��
//		int pageCount = listCount/pageSize + (listCount%pageSize == 0 ? 0 : 1);
//		
//		String endstring = "";
//		//��ȡ�����Խ���·��ƴ��
//		if(clazz != null && obj != null){
//			String str = "";
//			try {
//				Field[] declaredFields = clazz.getDeclaredFields();
//				for (Field field : declaredFields) {
//					field.setAccessible(true);
//					Object object = field.get(obj);
//					str += field.getName()+"="+(field.get(obj) == null ? "" : field.get(obj))+"&";
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			endstring = str.substring(0, str.length() - 1);
//		}
//		
//		
//		
//		
//		//�����뷨��дһ��flag�ж����ѭ���Ķ���ֻҪ����Ϊ���ڽ���һ���жϵ���û�������ֻ�ܵȳ����µĴ����ټ�������
//		
//		//��������ǲ��е�   ��Ϊ�������Ե��ַ���ƴ��  ���Կ϶����ȴ���0
////		String flag = substring.length() == 0 ? "?" : "&";
//		
//		//System.out.println("pageCount=="+pageCount);
//		// �ж�url���Ƿ���?�ţ�����У�����ͨ��&���Ž������ӣ�����ͨ��?��������
//		String flag = url.indexOf("?") != -1 ? "&" : "?";
//		
//		url += endstring;
//		
//		// ��ҳ����ҳ����һҳ����һҳ��ĩҳ
//		String first = "";
//		String prev ="";
//		String next = "";
//		String last = "";
//		
//		if(pageNum != 1) {
//			first = "<a href='"+request.getContextPath()+url+flag+"pageNum=1'>��ҳ</a>";
//		} else {
//			first = "��ҳ";
//		}
//		
//		if(pageNum > 1) {
//			prev = "<a href='"+request.getContextPath()+url+flag+"pageNum="+(pageNum-1)+"'>��һҳ</a>";
//		} else {
//			prev = "��һҳ";
//		}
//		
//		if(pageNum < pageCount) {
//			next = "<a href='"+request.getContextPath()+url+flag+"pageNum="+(pageNum + 1)+"'>��һҳ</a>";
//		} else {
//			next = "��һҳ";
//		}
//		
//		if(pageNum != pageCount) {
//			last = "<a href='"+request.getContextPath()+url+flag+"pageNum="+pageCount+"'>ĩҳ</a>";
//		} else {
//			last = "ĩҳ";
//		}
//		request.setAttribute("page", "����"+listCount+"������"+" ��ǰΪ��"+pageNum+"ҳ &nbsp;"+first+" "+prev+" "+next+" "+last);
//	}
//	
//}
