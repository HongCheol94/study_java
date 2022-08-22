package com.hongcheol.study.ch05;

import java.util.Arrays;

public class lotto {

	public static void main(String[] args) {
		
		double min = 1.0;
		double max = 45.0;
		int random = 0;
		
		String randomString = "";
		int[] randomArray = new int[6];
		
		Boolean isSameNumber = true;
		Boolean isLinearNumber = true;
		Boolean isSameOldNumber = true;
		
		while(isSameNumber || isLinearNumber || isSameOldNumber) {
			
			for(int i=0; i<6; i++) {
				random =(int)((Math.random()*(max - min)) + min);
				randomArray[i] = random;
			}
			
//			System.out.println(randomString);
//			System.out.println("-------------");
			
		//	test date
//			randomArray[0] = 1;
//			randomArray[1] = 2;
//			randomArray[2] = 2;
//			randomArray[3] = 6;
//			randomArray[4] = 8;
//			randomArray[5] = 11;
			
			//오름 차순 정렬
			Arrays.sort(randomArray);
			
			for(int i=0; i<6; i++) {
				System.out.println(i);
			}
			
//			중복값 확인
			aa:
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(i !=j) {
						if(randomArray[i] == randomArray[j]) {
							isSameNumber = true;
							break aa;
						} else {
							// by pass
						}
					}
				}
			}
				
			// 3연속 걸르기
			for(int i=0; i<4; i++) {
//					1,2,3
//					2,3,4
//					3,4,5
//					4,5,6
//					4번만 검사하면 됨
				if(randomArray[i]+1 == randomArray[i+1] && randomArray[i] + 2 == randomArray[i+2]) {
					System.out.println("걸렸다.: "+ randomArray[i] + ":" + randomArray[i+1] + ":" + randomArray[i+2]);
					isLinearNumber = true;
					break;
				} else{
					isLinearNumber = false;
				}
			}
				
			//문자열로 변환
			
		
		}

	}

}
