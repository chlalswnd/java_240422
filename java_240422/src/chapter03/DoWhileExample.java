package chapter03;

/*
 * do while 문
 * a~z 알파벳 소문자 출려
 */
public class DoWhileExample {
	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
//			c+1 => 문자 + 정수 = 정수
//			유니코드 변환해서 1증가한 유니코드가 문자로 변환해서 변수 c에 저장
//			c = (char)(c+1);
			c += 1;//c=c+1 //자동 변환
		} while (c <= 'z');
	}
}