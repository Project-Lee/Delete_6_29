package cafetest;

public class MenuItem {

	private final String NAME;
	private final int PRICE;
	
		
	public MenuItem(String name, int price) {
		this.NAME = name;
		this.PRICE = price;
	}
	
	public String getName() {
		return NAME;
	}
	
	public int getPrice() {
		return PRICE;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %,d원",NAME,PRICE);
	}
}
