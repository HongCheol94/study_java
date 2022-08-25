package com.hongcheol.study.ch07.frist;

public class DmbCellPhone extends CellPhone{
// 자식
	
	//필드
	int channel;
	
	//생성자(명시적 생성자)
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	DmbCellPhone() {
		
	}
	
	//메소드
	void turnOnDmb() {
		
		powerOn();
		System.out.println("채널" + channel + "번 DMB 방송을 수신합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
		
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
}
