package com.hongcheol.study.ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		int[] scoreEnglish;
		int scoreMath[];
		
		
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"장원영", "장동건" , "고소영"};

		
		System.out.println("명지님 화학성적: " + scoreChemistry[0]);
		
		System.out.println("누굴까 : " + name[2]);//
		
		
		
		
//		scoreChemistry 의 평균을 구해서 출력 하시오		
		
//		1번째 방법
//		
//		int sum = 0;
//		double avg = 0;
//		
//		for(int i=0; i<scoreChemistry.length; i++) {
//			 sum = scoreChemistry[i];
//		}
//		avg = sum/scoreChemistry.length;
//				System.out.println(avg);
//		
	
//		2번쨰 방법
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<4; i++) {
			 sum = scoreChemistry[i];
		}
		avg = sum/5;
		System.out.println(avg);
		
		
		
		
	}

}
