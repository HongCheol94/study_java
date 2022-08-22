package com.hongcheol.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44},{55,55,77}};
		
		System.out.println("score[1][1] : " + scores[1][1]); // 77
		System.out.println("score[4][2]: " + scores[4][2]);	//	77
		System.out.println("score[2][2]: " + scores[2][2]); //  44
		System.out.println("score[0][0]: " + scores[0][0]); // 99
		System.out.println("score[1][0]: " + scores[1][0]); // 55
		
		
//		1. 개인의 평균
//		2. 과목별 평균
		
//		1번
		

		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			double avg = 0;
			
			for(int j=0; j<scores[i].length ; j++) {
				sum += scores[i][j];
			}avg=(double)sum/scores[i].length;
			System.out.println("평균: " + avg);
		}
			
//			2번
			
			int korea = 0;
			int math = 0;
			int eng = 0;

			for(int i=0; i<scores.length; i++) {
				int sum = 0;
				double avg = 0;
				
				korea = scores[i][0];
				math =  scores[i][1];
				eng = scores[i][2];
				
				for(int j=0; j<scores[i].length ; j++) {
					sum += scores[i][j];
				}avg=(double)sum/scores[i].length;
				System.out.println("평균: " + avg);
			}
				System.out.println("korea평균은"+ korea/3);
				System.out.println("korea평균은"+ math/3);
				System.out.println("korea평균은"+ eng/3);
		
//		2번 다른 답
		for(int j=0; j<3; j++) {
			int sum=0;
			for(int i=0; i<5; i++) {
				sum += scores[i][j];
			}
			System.out.println("국어평균: "+ ((double)sum/5));
		}
// 		2번 선생님 답
		String[] subject = {"국어","영어","수학"};
		
		int[] sum2 = new int[3];
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum2[j] += scores[i][j];
			}
		}
		for(int i=0; i<sum2.length; i++) {
			System.out.println(subject[i]+"과목의 평균 점수는: "+((double)sum2[i]/scores.length));
		}
	}

}
