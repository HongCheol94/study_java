package com.hongcheol.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		
//  int 타입의 변수를 1개 선언하고		
//  짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오
		
		int x = 9;
		
		if(x % 2 == 1) {
			System.out.println("홀수입니다");
		}else if (x % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("x: 홀수입니다.");
		}
		
//--------------------------------------------	
		
		int a = 4;
		
		if(a != 0) {
			if(a%2 == 0) {
				System.out.println("짝수 입니다");
			} else {
				System.out.println("홀수 입니다");
			}
		} else {
			//0
			System.out.println("0은 홀짝을 판한할 수 없습니다.");
		}
		
		
	}

}
