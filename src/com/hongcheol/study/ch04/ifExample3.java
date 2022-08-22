package com.hongcheol.study.ch04;

public class ifExample3 {

	public static void main(String[] args) {

// int 타입의 변수를 2개 선헌하고
// 두 정수 가 주어졌을때 두 정수를 비교하여
// 크기 비교 결과를 나타내는 프로그램을 작성하세요
		
		int red = 94;
		int blue = 97;
		
		if(red>blue) {
			System.out.println("red>blue 레드는 블루보다 크다");
		}else if(red<blue) {
			System.out.println("red<blue 레드는 블루보다 작다");
			
		}else {
			System.out.println("red=blue 레드는 블루와 같다");
		}

	}

}
