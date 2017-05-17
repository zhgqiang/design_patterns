package cn.daemon.design.strategy;

public class FlyRocketPowered implements FlyBehavior{

	public void fly() {
		System.err.println("飞行的火箭");
	}

}
