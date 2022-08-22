package com.hongcheol.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		
		//		연습
				
		//	아이폰 클레스 실행
		//	field는 이름
		//  아이폰 실행 클래스 생성
		// 아이폰 클래스의 이름 호출		
			
		Iphone iphone = new Iphone(); // 객체 생성 
		
		System.out.println("iphone.names[1] : " + iphone.names[1]);

		iphone.names[1] = "Iphone12 Pro"; // 객체값 초기
		
		System.out.println("iphone.names[1] : " + iphone.names[1]);
		
		iphone.pr();
		
		Car car = new Car();
		System.out.println("car.name" + car.name);

//		iphone.setId(123);
//		iphone.setName("Haneul");
//		iphone.setPassword("dsfjklbnkasf!@");
//
//		System.out.println("iphone.getid() : " + iphone.getId());
//		System.out.println("iphone.getName() : " + iphone.getName());
//		System.out.println("iphone.getPassword() : " + iphone.getPassword());
	
		//	sum(a,b);  IphoneExample main 파일 내부 함수 사용 
			
		//	iphone.name[1] = 
			
		//	System.out.println("iphone.name: "+ iphone.name);
			
		//	iphone.pr();
			
		//	Car car = new Car();
		//	System.out.println("car.name: "+ car.name);
	}

//	public static void sum(int a, int b) { // 내부 함수 생성 
//		int sum = 0;
//		sum = a + b;
//		System.out.println("sum :" + sum);
//	}
}
