package com.hongcheol.study.ch07.forth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		 supersonicAirplane.takeOff();
		 supersonicAirplane.fly();
		 supersonicAirplane.flyMode = supersonicAirplane.SUPERSONIC;
		 supersonicAirplane.fly();
		 supersonicAirplane.flyMode = supersonicAirplane.NORMAL;
		 supersonicAirplane.fly();
		 supersonicAirplane.land();
		 
//		상수파일 생성 후 코드
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constantss.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constantss.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		
	}

}
