package cn.daemon.design.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.err.println("I'mareal Mallard duck");
	}
	
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
