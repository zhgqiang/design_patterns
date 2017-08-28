package cn.daemon.design.adapter;

public class WildTurkey implements Turkey {

	public void gobble() {
		System.err.println("Gobble gobble");
	}

	public void fly() {
		System.err.println("I am flying a short distance");
	}

}
