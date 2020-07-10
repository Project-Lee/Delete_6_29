package 개중요_집가서무조건보기;

import java.util.ArrayList;
import java.util.List;

class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	 
	// 집가서 확인 toString 오버라이딩해서 밑에 Buy 클래스에 출력문으로 사용함 ( 주소안찍히고 직접 안에 값 찍히게끔 만들어줌 ) 
	@Override
	public String toString() {
		return String.format(getName() + "구매");
	}
	
}

class Tv extends Product {
	public Tv() {
		super("Tv",150);
	} 
}

class Computer extends Product {
	public Computer() {
		super("Computer",200);
	}
}

class Buy {
	
	// 물건살때마다 arr 에다가 계속 누적추가해줄것임
	// Product 클래스(상속포함) 전체를 담을 변수
	private List<Product> arr = new ArrayList();
	private int money = 0;
	private String[] item = new String[6];
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	
	// 이부분 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void buyer(Product p) {
		if(money < p.getPrice()) {
			int a = p.getPrice();
			int result = (a - money);
			System.out.println("=금액부족= " + p.getName() + "을 구매할수 없습니다" + result + "원 부족");
			
		} else {
			String[] str = new String[6];
			money -= p.getPrice();
			System.out.println("잔금 : " + money);
			arr.add(new Product(p.getName(),p.getPrice()));
			
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i));   // Product 클래스에 toString만들어서 실제 이름 나오게했음
												  // toString 안하면 주소값 찍힘
			}
		}
	}
	
	
}

public class Test1 {

	// 계속 누적해서 산물건들을 담아줌 
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Computer c1 = new Computer();
		
		Buy b = new Buy();
		b.setMoney(1000);
		
		b.buyer(c1);
		b.buyer(t1);
		
	}
}