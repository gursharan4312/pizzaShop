package pizza_shop;

public interface Price {
	double COST_OF_EACH_EXTRA_TOPPING=2.5;
	
	double PriceOfSmallPizza(double smallPizaPrice);
	double PriceofMediumPizza(double medSizePrze);
	double PriceofLargePizza(double largePizaSize);
}
