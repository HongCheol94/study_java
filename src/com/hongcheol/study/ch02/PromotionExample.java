package com.hongcheol.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
//		자동 타입 변환 (promotion)
//		작은 형이 큰 혀응로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue:" + byteValue);
		
		short shortValue = byteValue;
		System.out.println("shortValue: "+ shortValue);
		
		int intValue = shortValue;
		System.out.println("intValue:" + intValue + "입니다");
		
		long longValue = intValue;
		System.out.println("longValue:" + intValue + "입니다");
		
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue + "입니다");
		
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue + "입니다");
		
		
		
	
		

		
	
	
		
	}

}
