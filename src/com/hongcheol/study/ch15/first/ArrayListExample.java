package com.hongcheol.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		인터페이서						구현클래스
		
		list.add("Java"); 				/* add 는 리스트에 추가하는것 */
		list.add("JDBC");
		list.add("Servlet/JSP");	
		list.add(2, "Database"); 		/* 중간에 인덱스를(순서) 정해줄 수 있다 */
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		String skill = list.get(2); 	/* get 가져오기 */
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println();
				
		list.remove(2); 			/* remove는 제거 */
		list.remove(2);
		list.remove("iBATIS"); 		/* 직접적으로 제거 */
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
