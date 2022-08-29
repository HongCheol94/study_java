package com.hongcheol.study.ch07.fifth;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷에 검색을 합니다.");
	}
}
