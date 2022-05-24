package strategypattern;

public class Customer {

	private Order order; 
	
	public void setOrder(Order schedule){
		this.order = order;
	}
	
	public void makeOrder() {
		this.order.order();
	}
	
}
