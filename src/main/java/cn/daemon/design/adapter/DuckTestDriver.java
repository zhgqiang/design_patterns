package cn.daemon.design.adapter;

public class DuckTestDriver {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();

		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.err.println("The Turkey says ...");
		turkey.gobble();
		turkey.fly();

		System.err.println("The Duck says ...");
		testDuck(duck);

		System.err.println("The TurkeyAdapter says ...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
