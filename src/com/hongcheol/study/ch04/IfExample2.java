package com.hongcheol.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		
		
// 일반:1, 5% 할인적용		
// 브론즈:2, 10%할인적용	
// 실버:3, 15%할인적용
// 골드:4	, 20% 할인적용	
//플래티넘:5, 2.7% 할인적용		
		
		
		int grade = 5;
		int cost = 12000;
		
		if(grade == 1) {
			double price = cost*(1-0.05);
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는: " + (int)price + "원 입니다.");
		} else if(grade == 2) {
			double price = cost*(1-0.10);
			System.out.println("정가가" + cost + "원인 브론즈 등급의 할인가는: " + (int)price + "원 입니다.");
		} else if(grade == 3) {
			double price = cost*(1-0.15);
			System.out.println("정가가" + cost + "원인 실버 등급의 할인가는: " + (int)price + "원 입니다.");
		} else if(grade ==54 ) {
			double price = cost*(1-0.2);
			System.out.println("정가가" + cost + "원인 골드 등급의 할인가는: " + (int)price + "원 입니다.");
		} else if(grade == 5) {
			double price = cost*(1-0.027);
			System.out.println("정가가" + cost + "원인 플래티넘 등급의 할인가는: " + (int)price + "원 입니다.");
	}	else {
		System.out.println("1~5 까지의 grade 만 가능합니다.");
	
	}
		
		
		
		
		
//		int grade = 3;
//		int price = 10000;
//		
//		if(grade == 1) {
//			price *= 0.95;
//			System.out.println("5% 할인 적용가:" + price);
//		}
//		
//		else if(grade == 2) {
//			price *= 0.9;
//			System.out.println("10% 할인 적용가: " + price);
//		}
//		
//		else if(grade == 3) {
//			price*=0.85;
//			System.out.println("15% 할인 적용가: " + price);
//		}
//		else if(grade == 4) {
//			price*=0.8;
//			System.out.println("20% 할인 적용가" + price);
//		}
//		else {
//			price*=0.75;
//			System.out.println("2.5% 할인 적용가: " + price);
//		}
		

	}

}
