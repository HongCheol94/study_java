package com.hongcheol.study.test;

import com.hongcheol.study.ch07.third.Calculator;
import com.hongcheol.study.ch07.third.Computer;

public class computerExample {

	public static void main(String[] args) {
		int r = 7;
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적: " + calculator.areaCircle(2));
		
		Computer computer = new Computer();
		
		System.out.println("원면적: "+ computer.areaCircle(2));
		
	}

}
