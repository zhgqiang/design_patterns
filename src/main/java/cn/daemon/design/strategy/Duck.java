package cn.daemon.design.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;

	QuackBehavior quackBehavior;

	public void swim() {
		System.err.println("游泳");
	}

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
