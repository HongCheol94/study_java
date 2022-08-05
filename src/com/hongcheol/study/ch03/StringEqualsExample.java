package com.hongcheol.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1=" + result1); // true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2=" + result2); //false
		
		System.out.println("str1.equals(str2): " + str1.equals(str2)); // ==(x) true
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // ==(x) true
		
		//문자열을 비교할때는 .equlas함수 사용
		System.out.println(str1.equals(str3));
	}

}
