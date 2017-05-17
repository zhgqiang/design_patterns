package cn.daemon.design.strategy;

public class Quack implements QuackBehavior {

	public void quack() {
		System.err.println("鸭子呱呱叫");

	}

}
