package com.hongcheol.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {
			case 1:
				System.out.println("1이 나왔습니다.");
				break;
			case 2:
				System.out.println("2이 나왔습니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수 입니다.");
				break;
		}
		
		
		String position = "부장";
		 
		switch (position) {
		case "사원":
			System.out.println("연봉은 5,000입니다.");
			break;
		case "대리":
			System.out.println("연봉은 5,000입니다.");
			break;
		case "과장":
			System.out.println("연봉은 5,000입니다.");
			break;
		case "부장":
			System.out.println("연봉은 5,000입니다.");
			break;
		case "사장":
			System.out.println("연봉은 5,000입니다.");
			break;
		default:
			System.out.println("없는 position입니다. 다시 입력해 주세요");
			break;
		}
	}

}
