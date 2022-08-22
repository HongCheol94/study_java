package com.hongcheol.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		
//  int 타입의 변수를 2개 선헌하고
//	두 정수 가 주어졌을대 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
		
		int x = 3;
		int y = 9;
		
		if(x >0 && y >0) {
			System.out.println("1사분면 입니다.");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면 입니다.");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면 입니다.");
		}else if(x > 0 && y < 0) {
			System.out.println("4사분면 입니다.");
		}else {
			System.out.println("1사분면 입니다.");
		}
			
		int a = 2;
		int b = 0;
		
		if(a>0 && b>0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if(a>0 && b<0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if(a==0 & b!=0) {
			System.out.println("(a,b)는 x축 위에 위치합니다");
		} else if(a!=0 && b== 0) {
			System.out.println("(a,b)는 y축 위에 위치합니다");
		} else {
			System.out.println("사분면에 위치합니다.");
		}
		
		
		
		
		
		
		
		
	}

}
