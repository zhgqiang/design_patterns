package cn.daemon.design.singleton;

public class Singleton3 {

	private static Singleton3 singleton = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return singleton;
	}
}
