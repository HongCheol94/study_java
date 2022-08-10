package com.hongcheol.study.ch04;

public class text {

	public static void main(String[] args) {
		
		
		int num1=1;
        int num2=100;
        int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
        int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
        int sum=0;

        if(random1>random2){
            for(int i=random2; i<=random1; i++){
                sum=sum+i;                
                System.out.println("최소값과 최대값의 사이의 합은 " + sum + "입니다.");
            }            
        }else if(random2>random1){
            for(int i=random1; i<=random2; i++){
                sum=sum+i;                
                System.out.println("최소값과 최대값의 사이의 합은 " + sum + "입니다.");
            }
        }else{
            System.out.println("최대값과 최소값이 같네요?");
        }
		
		
		
	        }
		

	}


