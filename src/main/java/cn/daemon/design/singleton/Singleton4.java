package cn.daemon.design.singleton;

public class Singleton4 {

	private volatile static Singleton4 singleton;

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				singleton = new Singleton4();
			}
		}
		return singleton;
	}
}
