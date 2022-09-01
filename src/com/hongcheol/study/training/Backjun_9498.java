package com.hongcheol.study.training;

import java.util.Scanner;

public class Backjun_9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		sc.close();
		
		if(score <= 100 && score >= 90) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		

	}

}
