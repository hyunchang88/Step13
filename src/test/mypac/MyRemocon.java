package test.mypac;

public class MyRemocon implements Remocon{ // 인터페이스는 implements

	@Override
	public void up() {
		System.out.println("무언가를 올려요!");
	}

	@Override
	public void down() {
		System.out.println("무언가를 내려요!");
	}
	
}
