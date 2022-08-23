package com.hongcheol.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		CarSecond carSecond = new CarSecond();
//		String color;
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("white",3000);
//		String color2 = "Red"
		
//		System.out.println("carSecond.color: " + carSecond.color);
		System.out.println("carSecond2.color: "+ carSecond2.color);
		System.out.println("carSecond2.cc; "+ carSecond2.cc);
		
		System.out.println("carSecond3.color: " + carSecond3.color);
		System.out.println("carSecond3.cc " + carSecond3.cc);

		
		CarSecond carSecond4 = new CarSecond("소나타");
		CarSecond carSecond5 = new CarSecond("그렌져",3000);
		CarSecond carSecond6 = new CarSecond("g80", 3000, "gray");
		CarSecond carSecond7 = new CarSecond(3300);
		CarSecond carSecond8 = new CarSecond(3300, "gv70");
	}

}
