package com.hongcheol.study.ch04;

public class IfExample {

	public static void main(String[] args) {
		
//		int score = 80;
		
//		if(score >= 90) {
			System.out.println("A");
//		} else {
			System.out.println("A는 아니구나");
//		}

			
		int score = 80;
		if(score >= 90) 
			System.out.println("A");
		 else if(score >= 80 && score < 90) 
			System.out.println("B");
		 else if(score >= 70 && score < 80)
			System.out.println("C");
		 else if(score >= 60 && score < 70)
			 System.out.println("D");
		 else
			 System.out.println("F");
			
		
	
		
	  
	}

}
