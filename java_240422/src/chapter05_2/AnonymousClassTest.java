package chapter05_2;

interface RemoteControl{
	void trunOn();
	void trunOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		//익명 클래스 정의(인터페이스 이름 사용 -> 객체 구현)
		RemoteControl rc = new RemoteControl() {
			@Override
			public void trunOn() {
				System.out.println("TV turnOn");
			}
			@Override
			public void trunOff() {
				System.out.println("TV turnOff");
			}
		};
//		익명 클래스 객체의 메소드 호출
		rc.trunOn();
		rc.trunOff();
		
	}
}