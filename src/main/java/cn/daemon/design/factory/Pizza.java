package cn.daemon.design.factory;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;

	public void prepare() {
		System.err.println("prepare");
	}

	public void bake() {
		System.err.println("bake");
	}

	public void cut() {
		System.err.println("cut");
	}

	public void box() {
		System.err.println("box");
	}

	public String getName() {
		return name;
	}
}
