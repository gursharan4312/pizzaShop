package pizza_shop;

public class Feast extends Pizza implements Price,Tax{
 
	public Feast(String type,String size) {
		super(type,size);
	}
	public Feast(String size) {
		super("Feast",size);
	}
	
	public int addToppings() {
		if(getToppings().size()<3) {
			getToppings().add("1");
		}
		return getToppings().size();
	}

	@Override
	public double totalCost(String type, String size,int toppings) {
		double totalPrice=0;
		size=size.toLowerCase();
		switch(size) {
		case "small" : totalPrice+= PriceOfSmallPizza(0); break;
		case "medium": totalPrice+= PriceOfSmallPizza(1); break;
		default : totalPrice += PriceOfSmallPizza(2);
		}
		
		totalPrice+=(toppings)*COST_OF_EACH_EXTRA_TOPPING;
		
		return totalPrice;
		
	}

	@Override
	public double PriceOfSmallPizza(double smallPizaPrice) {
		 return this.getPrice(0);
	}

	@Override
	public double PriceofMediumPizza(double medSizePrze) {
		return this.getPrice(1);
	}

	@Override
	public double PriceofLargePizza(double largePizaSize) {
		return this.getPrice(2);
	}

	@Override
	public String printBill() {
		double totalCost = this.totalCost(this.getType(), this.getSize(), this.getToppings().size());
		String s = "Pizza size : " + this.getSize() +" \n" + 
					"Pizza Type : " + this.getType() +"\n" + 
					"Total toppings : " + this.getToppings().size() + "\n"+
					"Toatl Price : $" + totalCost +"\n"+
					"Total Tax : $" + CalcTax(totalCost)+"\n" +
					"Total Cost after tax : $" + (CalcTax(totalCost)+totalCost)+"\n\n";
		return s;
	}

	@Override
	public double CalcTax(double totalCost) {
		return (TAX_RATE*totalCost)/100;
	}
	


}
