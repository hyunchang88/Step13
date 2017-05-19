package test.main;

import test.mypac.Remocon;
import test.mypac.TVRemocon;

public class MainClass03 {
	public static void main(String[] args) {
		Object r1 = new TVRemocon();
		Remocon r2 = new TVRemocon();
		TVRemocon r3 = new TVRemocon();
		// TVRemocon 을 여러가지 type으로 받을수 있어
		// 이게 바로 java의 다형성
		
		// Remocon 인터페이스의 static final 멤버필드 참조
		String info = Remocon.COMPANY; // 인터페이스에 점 찍어서 접근
		//String info2 = r2.COMPANY; // 참조값에 점 찍어서 접근도 가능 한데 경고 메세지 뜸
		int v = Remocon.VERSION;
		String info2 = TVRemocon.COMPANY;
		int v2 = TVRemocon.VERSION;
		
		// 참고
		// 지역변수  혹은 필드에 final 예약어를 붙이면 상수화 된다.
		// 상수 => 수정 불가
		// 관례상 변수명 혹은 필드명은 모두 대문자로 작성한다.
		final String NAME = "김구라";
		//name = "kim"; // 수정불가
	}
}
