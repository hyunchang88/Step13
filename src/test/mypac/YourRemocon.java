package test.mypac;

public class YourRemocon  implements Remocon{

	@Override
	public void up() {
		System.out.println("니 리모컨으로 무언가를 올려");
	}

	@Override
	public void down() {
		System.out.println("니 리모컨으로 무언가를 내려");
	}

}
