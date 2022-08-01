package com.hongcheol.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		//강제 형변환 : casting : (원하는형) 변수명
		
		double doubleValue = 12345567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891;  // 7자리 이상인 경우에는 E로 표현됨
		System.out.println("doubleValue:" + doubleValue2);

		
		// folat 변수에 double 대입
		float floatValue = (float)doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		
		//long <-- float
		long longValue = (long)floatValue;
		System.out.println("longValue: " + longValue);
		
		//int <-- long
		int intValue = (int)longValue;
		System.out.println("intValue: "+ intValue);

		//short <-- int
		short shortValue = (short)intValue;
		System.out.println("short: " + shortValue);
		
		//byte <-- short
		byte byteValue = (byte)shortValue;
		System.out.println("byteValue: " +byteValue);
		
		
		// int를 string으로 변환
		int intValue2 = 30;
		String stringValue = String.valueOf(intValue2);
		System.out.println(stringValue);
		
	
		
		// string을 int로 변환
		String stringValue2 = "123456";
		int num = Integer.parseInt(stringValue2);
		System.out.println(num);
		
		//string 을 int 로 변환  선생님이 친거
		String stringValue3 = String.valueOf(intValue);
		System.out.println("stringValue: "+ stringValue);
		
		// int를 string로 변환
		int intValue3 = Integer.parseInt(stringValue);
		System.out.println("intValue2: " + intValue3);
				
	}

}
