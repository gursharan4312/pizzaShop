package pizza_shop;

public class PizzaShop {
	public static void main(String[] args) {
		
		Regular pizza1=new Regular("Medium");
		pizza1.addToppings();
		pizza1.addToppings();
		System.out.printf(pizza1.printBill());
		
		Feast pizza2=new Feast("Large");
		pizza2.addToppings();
		pizza2.addToppings();
		pizza2.addToppings();
		System.out.printf(pizza2.printBill());
	}
	
}
