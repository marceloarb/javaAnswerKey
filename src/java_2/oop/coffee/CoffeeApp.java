package java_2.oop.coffee;

public class CoffeeApp {

	public static void main(String[] args) {
/*
	- Create 4 different CoffeeBean (instances) (Java, Kona, Geisha, etc.)
	- Create 4 different cups for the brewed coffee
	- Create at least 1 CoffeeMaker to brew the Coffee.
	- Brew Coffee in the Coffee Maker and fill the four cups with different types of Coffee.
	-
 */

		CoffeeBeans java = new CoffeeBeans("java", "Don't care");
		Cup mug = new Cup();
		CoffeeMaker keureg = new CoffeeMaker("keureg","expresso",false);
		keureg.powerOn(); // (Defined in the Machine Interface)
		mug = keureg.brew(java,mug);
		mug.drink();
		keureg.powerOff();// (Defined in the Machine Interface);
	}
}
