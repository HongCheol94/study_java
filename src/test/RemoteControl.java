package test;

public interface RemoteControl {
	
	public static final int max_Volume = 10;
	int min_volum = 0;
	
//	추상메서드
	public abstract void turnOn();
	void turnOff();
	void setvolume(int volume);
	
//	디폴트메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
//	정적메서드
	static void changeVattery() {
		System.out.println("건전지를 교체합니다");
	}
}
