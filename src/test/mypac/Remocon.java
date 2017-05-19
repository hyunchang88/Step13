package test.mypac;
/*
 *		[ interface ]
 * 
 *	 - 생성자가 없다 (객체 생성 불가)
 *	 - 추상 메소드만 정의할 수 있다.
 *	 - 필드는 static final(상수) 멤버필드만 가질수 있다. 
 *	 - 데이터 type 역활을 할수 있다.
 * 
 */
public interface Remocon {
	// 필드 정의하기
	public static final String COMPANY = "LG";  // final 상수는 관례상 대문자로 씀
	public static final int VERSION = 1;	// interface는 무조건 static final 이기때문에 생략해도 상관없음
	// 메소드 정의하기
	public abstract void up();
	public void down(); // abstract 생략 가능 // cause : 안붙여도 다 추상 메소드니까
	
}
