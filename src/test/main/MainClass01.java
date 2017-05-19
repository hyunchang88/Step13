package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass01 {
	public static void main(String[] args) {
//		
//		Remocon a = null;
//		a.up(); // type 역활은 충분히 하는데(쩜 찍어서 목록이 나오니까) NullPointException 이 발생함(참조값이 없기때문에).
//		
		
		// MyRemocon 클래스의 생성자를 이용해서 Remocon 객체를 생성한 다음
		// Remocon 인터페이스 type 변수에 참조값을 담는다.
		Remocon a = new MyRemocon();
		// 메소드 호출하기
		a.up();
		a.down();
		
		Remocon b = new YourRemocon();
		b.up();
		b.down();
		
	}
}
