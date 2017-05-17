package cn.daemon.design.strategy;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.err.println("鸭子吱吱叫");

	}

}
