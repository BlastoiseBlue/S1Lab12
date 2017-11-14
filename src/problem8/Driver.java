/**
 * @author Emmet Stanevich
 */
package problem8;

public class Driver {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("Large", 1, 0, 1);// Large pizza, 1 cheese, no pepperoni, 1 ham
		Pizza pizza2 = new Pizza(1, 2, 2, 0);// Medium pizza, 2 cheese, 2 pepperoni, no ham
		PizzaOrder order1 = new PizzaOrder(2);
		order1.setPizza1(pizza1);
		order1.setPizza2(pizza2);
		order1.outputTotal();
		PizzaOrder order2 = new PizzaOrder(order1);
		order2.getPizza1().setCheese(3);
		order2.outputTotal();
		order1.outputTotal();
	}

}
