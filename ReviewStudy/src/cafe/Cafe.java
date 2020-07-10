package cafe;

/*
 * 직접 메인메소드로 실행하는 부분
 */
public class Cafe {

	public static void main(String[] args) {
		// 일일이 하나하나 값을 넣어주는 생성자 
		// 하지만 밑에 menus라는 배열을 통해 값을 넣어주므로 굳이 이렇게 안해도됨
//		MenuItem mi = new MenuItem("아메리카노",1500);
//		MenuItem mi2 = new MenuItem("카푸치노",2000);
//		
//		
//		
//		System.out.println(mi); // toString 오버라이딩 으로 만든 메소드
//		mi.menuInfo(); // 내가직접만든 메소드
//		
//		
//		
//		System.out.println("----------");
//		
//		
//		
//		Menu menu = new Menu(); // 메뉴판 객체 생성하면 init() 메소드로 인해
//								//                안에다가 값을 넣어줌
//		System.out.println(menu);		
//		menu.showMenus1(); // 메뉴판 보여주는 메소드
//		
//		
//		
//		System.out.println("----------");
		
		
		
		
//		// 헷갈려하지말자 ! 간략하게 작성하면 ↓
//		// System.out.println(menu.choose(1));  과 같은거 
//		Menu menu = new Menu();
//		MenuItem mi3 = menu.choose(0);
//		System.out.println(mi2);
		
		Customer cus = new Customer();
		Menu menu = new Menu();
		Barista bas = new Barista();
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		
		System.out.println(coffee);
		
		cus.drinkCoffee(coffee);
		
		
		
		
	}

}
