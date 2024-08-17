package pizzaBillGenerator;

public class combain {
	public static void main(String[] args) {

		boolean veg;
		Pizza basePizza = new Pizza(veg = true);
		basePizza.addExtraCheese();
		basePizza.addExtraToppings();
		basePizza.takeAway();
		basePizza.getBill();

		// DeluxPizza dp = new DeluxPizza(veg = false);
		// dp.addExtraCheese();
		// dp.addExtraToppings();
		// dp.takeAway();
		// dp.getBill();
	}
}
