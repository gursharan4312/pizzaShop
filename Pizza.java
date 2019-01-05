package pizza_shop;

import java.util.ArrayList;

public abstract class Pizza {
		private String size;
		private String type;
		protected ArrayList<String> toppings=new ArrayList<String>();
		protected double[] base_price = {10,12,14};
		
		public Pizza(String type,String size) {
			this.size=size;
			this.type=type;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public ArrayList<String> getToppings() {
			return toppings;
		}
		public double getPrice(int size) {
			switch(size) {
			case 0:return this.base_price[0];
			case 1:return this.base_price[1];
			case 2:return this.base_price[2];
			default: return this.base_price[1];
			}
		}
		public abstract double totalCost(String type,String size,int toppings);
		public abstract String printBill();
}