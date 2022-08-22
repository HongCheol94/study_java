package com.hongcheol.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		
//		int 타입의 변수를 3개 선헌하고		
//		최소값 최대값 구하기
		
	
		int a = 7;
		int b = 7;
		int c = 7;
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
			System.out.println("최대값은 a: " + a);
		} else if ( b > a && b > c) {
			System.out.println("최대값은 b: " + b);
		} else {
			System.out.println("최대값은 c: " + c);
		}
		
		
		if(a<b && a<c) {
			System.out.println("최소값은 a: "+ a);
		} else if (b < a && b < c) {
			System.out.println("최소값은 b: "+ b);
		}else {
			System.out.println("최소값은 c: " + c);
		}
		
	}else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해주세요");
		}
		
		
	}

}
