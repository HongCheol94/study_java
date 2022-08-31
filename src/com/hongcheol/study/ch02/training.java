package com.hongcheol.study.ch02;

import java.util.Scanner;

public class training{

	public static void main(String[] args) {
		
	//체스 총 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개 총 = 16개
		
		Scanner sc = new Scanner(System.in);
		int[]chess = {1,1,2,2,2,8};
		int[]a = new int[chess.length];
		
		for(int i=0; i<chess.length; i++) {
			int num = sc.nextInt();
			a[i] = chess[i] - num;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+"");
		}
	}
}