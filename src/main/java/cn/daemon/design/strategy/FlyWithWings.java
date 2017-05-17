package cn.daemon.design.strategy;

public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.err.println("实现鸭子飞行");
	}

}
