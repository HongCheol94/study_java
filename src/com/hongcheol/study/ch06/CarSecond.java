package com.hongcheol.study.ch06;

public class CarSecond {
	
	
	
	String color= "red";
	int cc = 1500;
	String name = "아반떼";
	
//	CarSecond(String str) {
//		color = str;
//	}
	
//	CarSecond(String str, int num){
//		color = str;
//		cc = num;
//	}	
	//기본생성자-----------------

	CarSecond() {
		
	}
	CarSecond(String name) {
		this.name = name;
	}
	CarSecond(String name, int cc){
		this.color = name;
		this.cc = cc;
	}	
	CarSecond(String name, int cc, String color){
		this.color = name;
		this.cc = cc;
		this.color = color;
	}	
	CarSecond(int cc){
		this.cc = cc;
	}
	CarSecond(int cc, String name){
		this.name = name;
		this.cc = cc;
	}
	
}
