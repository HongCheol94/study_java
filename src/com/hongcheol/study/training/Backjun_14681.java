package com.hongcheol.study.training;

import java.util.Scanner;

public class Backjun_14681 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		if(x > 0 && y > 0) {
			System.out.println("Quadrant1");
		}else if(x <0 && y > 0) {
			System.out.println("Quadrant2");
		}else if(x < 0 && y < 0) {
			System.out.println("Quadrant3");
		}else {
			System.out.println("Quadrant4");
		}
	}
}
