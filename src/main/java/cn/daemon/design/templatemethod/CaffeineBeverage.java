package cn.daemon.design.templatemethod;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourIncCup();
		addCondiments();
	}

	abstract void addCondiments();

	abstract void brew();

	public void boilWater() {
		System.err.println("Boil Water");
	}

	public void pourIncCup() {
		System.err.println("pourIncCup");
	}
}
