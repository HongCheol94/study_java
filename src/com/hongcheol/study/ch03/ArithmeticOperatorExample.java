package com.hongcheol.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
//		int 변수 v1 에 초기값 5
//		int 변수 v2 에 초기값 2
		
//		int 변수 result1 에 + 연산 후 출력
//		int 변수 result2 에 - 연산 후 출력
//		int 변수 result3 에 * 연산 후 출력
//		int 변수 result4 에 / 연산 후 출력
//		int 변수 result5 에 % 연산 후 출력
		
		/*
		int v1 = 5;
		int v2 = 2;
		
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);
		System.out.println(v1 / v2);
		System.out.println(v1 % v2);
	
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		
		double result6 = v1 / v2;
		System.out.println("resylt5= " + result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result5=" + result7);
		
	
		
		int x=8;
		int y=7;
		int z=5;
		int result11=x+y+z;
		System.out.println(result11);
		
		int a=1;
		int b=9;
		int c=5;
		int result21=a+b+c;
		System.out.println(result21);
		
		int d=5;
		int e=6;
		int f=6;
		int result31=d+e+f;
		System.out.println(result31);
		
		int g=4;
		int h=7;
		int i=1;
		int result41=g+h+i;
		System.out.println(result41);
		
		int a1=7;
		int b1=5;
		int c1=5;
		int result51=a1+b1+c1;
		System.out.println(result51);
		
		int a2=4;
		int b2=2;
		int c2=9;
		int result61=a2+b2+c2;
		System.out.println(result61);
		
		int a3=5;
		int b3=9;
		int c3=9;
		int result71=a3+b3+c3;
		System.out.println(result71);
		
		int result8=9+4+5;
		System.out.println(result8);
		*/
		
		/*
		 * sum(8,7,5); sum(1,9,5); sum(5,6,6); sum(4,7,1); sum(7,5,5);
		 */
		avg("홍길동",60,70,85,90,45);
		avg("박말순",50,75,70,60,70);
		avg("고장난",55,60,64,58,90);
		avg("도롱뇽",80,70,63,88,78);
	}
	
//	public static void sum(int a, int b, int c) {
//		
//		System.out.println(a + "+" + b + "+" + c + "=" + (a+b+c));

	
	public static void avg(String name, int english, int math , int physics, int music , int athletic) {
		
		System.out.println(name + "의 평균은" +(double) (english + math +physics + music + athletic)/5);
	}
	
}
