package cn.daemon.design.strategy;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.err.println("什么都不做,不会飞");

	}

}
