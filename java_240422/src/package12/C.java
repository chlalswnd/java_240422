package package12;

//다른패키지에서 접근할때 import
import package11.A;

public class C {
	A a1 = new A(true);
	//default 접근 지정자는 다른 패키지에서 접근 불가
//	A a2 = new A(1);
	//private 접근 지정자는 접근 안된(자기 클래스만 접근됨)
//	A a3 = new A("문자열");
}