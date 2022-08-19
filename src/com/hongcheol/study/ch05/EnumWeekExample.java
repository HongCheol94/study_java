package com.hongcheol.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
	
		Week abc;
		
		Week xyz;
		
//		abc = 1;
//		abc = "asdfasf";
//		abc = 1.1;
		abc = Week.MONDAY; // 열거형 데이터 입력 방식
		
		
		System.out.println("Week.FRIDAY: " + Week.FRIDAY);
		System.out.println("abc: " + abc);
		
//		String name = abc;
		String name = abc.name();
		System.out.println("name: " + name);
		
		int drdinal =abc.ordinal();
		System.out.println("ordinal: " + drdinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + ": day: " +day);
			index ++;
		}
		
		
		
		
		
		
		
		
	}

}
