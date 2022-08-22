package ch06;

public class HermesExample {

	public static void main(String[] args) {
		
	Iphone iphone = new Iphone();
	
	System.out.println("iphone.name:" + iphone.name);
	
	iphone.pr();
	
	Car car = new Car();
	
	System.out.println("car.name: " + car.name);
	
	Hermes hermes = new Hermes();
	
	System.out.println("Hermes.name: " + hermes.name);
	
	car.name = "소나타";
	
	System.out.println("car.name: " + car.name);
			
	}

}
