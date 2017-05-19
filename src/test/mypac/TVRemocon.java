package test.mypac;

public class TVRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("TV 리모콘으로 채널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("TV 리모콘으로 채널을 내려요");
	}
	
	public void on(){
		System.out.println("TV 를 켜요");
	}
	
	public void off(){
		System.out.println("TV 를 꺼요");
	}
}
