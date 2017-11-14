package problem8;

import java.text.NumberFormat;

public class PizzaOrder {
	int numPizzas = 1;
	double totalCost = 0.0;
	Pizza pizza1 = new Pizza();
	Pizza pizza2 = new Pizza();
	Pizza pizza3 = new Pizza();
	NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

	public void setNumPizzas(int inputNumPizzas) {
		if (inputNumPizzas >= 1 && inputNumPizzas <= 3)
			numPizzas = inputNumPizzas;
	}

	public void placeOrder() {
		switch (numPizzas) {
		case 3:
			pizza3 = new Pizza();
		case 2:
			pizza2 = new Pizza();
		case 1:
			pizza1 = new Pizza();
			break;
		default:
			System.out.println("ERROR: Invalid quantity of pizzas.");
		}
	}

	public void placeOrder(int inputNumPizzas) {
		setNumPizzas(inputNumPizzas);
		placeOrder();
	}

	public void setPizza(Pizza pizza, int size, int numCheese, int numPepperoni, int numHam) {
		pizza.setSize(size);
		pizza.setCheese(numCheese);
		pizza.setPepperoni(numPepperoni);
		pizza.setHam(numHam);
	}

	public void setPizza(Pizza pizza, String size, int numCheese, int numPepperoni, int numHam) {
		pizza.setSize(size);
		pizza.setCheese(numCheese);
		pizza.setPepperoni(numPepperoni);
		pizza.setHam(numHam);
	}

	public void setPizza1(Pizza inputPizza) {
		pizza1 = inputPizza;
	}

	public void setPizza2(Pizza inputPizza) {
		pizza2 = inputPizza;
	}

	public void setPizza3(Pizza inputPizza) {
		pizza3 = inputPizza;
	}

	public double calcTotal() {
		totalCost = 0.0;
		switch (numPizzas) {
		case 3:
			totalCost = totalCost + pizza3.calcCost();
		case 2:
			totalCost = totalCost + pizza2.calcCost();
		case 1:
			totalCost = totalCost + pizza1.calcCost();
			break;
		}
		return totalCost;
	}

	public void outputTotal() {
		System.out.println(moneyFormatter.format(calcTotal()));
	}

	PizzaOrder() {
		placeOrder();
	}

	PizzaOrder(int inputNumPizzas) {
		placeOrder(inputNumPizzas);
	}
}
