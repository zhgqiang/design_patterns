package cn.daemon.design.strategy;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.err.println("什么都不做,不会叫");
	}

}
