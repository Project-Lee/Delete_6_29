package cafetest;

public class Cafe {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		
		
		// MenuItem 클래스가  원래 매개변수2개받는 생성자를 만들어야되는데 아예그냥 
		// MenuItem 클래스 매개변수에 바로 값을 집어넣자는 것 
		MenuItem choiceMenu = cus.order(menu);
		
		menu.showMenus();
		Coffee coffee = bas.makeCoffee(choiceMenu);
		cus.drinkCoffee(coffee);
		
		
		
		
	}

}
