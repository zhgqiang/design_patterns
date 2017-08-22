package cn.daemon.design.factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.bake();
		pizza.box();
		pizza.cut();
		pizza.prepare();

		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
