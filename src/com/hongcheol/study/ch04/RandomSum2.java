package com.hongcheol.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 랜덤 정수 2개를 발생시켜
		// 두 수 사이의 합을 구하라

		
		double num1 = 1.0;
		double num2 = 100.0;
		
		int sum = 0, min = 0, max = 0;
		
		int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
		int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
		
		if (random1 < random2) {
			max = random2;
			min = random1;
		}else {
			max = random1;
			min = random2;
		}
		
		System.out.println("min;" + min + "," +  "max:" + max );
		
		for(int i = min; i <= max; i++) {
			sum += i ;
			System.out.println(i + ":"+ sum);
		}
			System.out.println("total: " + sum);
	}

}
