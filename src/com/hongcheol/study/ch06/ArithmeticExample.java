package com.hongcheol.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		
		int resultAdd = arithmetic.Add(1,2);
		int resultMinus = arithmetic.Minus(1,2);
		int resultMulti = arithmetic.Multi(1,2);
		int resultDivid = arithmetic.Divid(1,2);
		int resultremind = arithmetic.remind(1,2);
		
		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMulti);
		arithmetic.say(resultDivid);
		arithmetic.say(resultremind);
		
		
	}

}
