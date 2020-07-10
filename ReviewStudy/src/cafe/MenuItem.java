package cafe;

// 메뉴판 - 커피이름,가격 을 가지고있는 클래스
public class MenuItem {
	
	// final로, 값이 입력되면 못바꾸게 해놓음
	private final String NAME;
	private final int PRICE;
	
		
	
	// final로 이루어진 name,price에 초기생성만으로 값 한번을 넣기위한 MenuItem 생성자
	public MenuItem(String name, int price) {
		
		
		this.NAME = name;
		this.PRICE = price;
		
	}
	
	// 이름을 확인하는 겟터 메소드
	public String getName() {
		return NAME;
	}
	
	// 가격을 확인하는 겟터메소드
	public int getPrice() {
		return PRICE;
	}
	
	
	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	// ☆☆☆이거중요 main메소드에서 System.out.print(mi); 했을시
	// toString으로 인해 주소값이 안찍히고 내가 원하는 내용을 찍고자할때 
	@Override
	public String toString() {
		
		return String.format("%s - %,d원",NAME,PRICE);
	}			
	 
	// 위에 toString() 메소드랑 같은역활 하는것 
	// 하지만 위에 toString을 사용하자 !  왜냐 ? 가독성때문에 	
	// 메인메소드에서 여러사람이 공동작업할시 다른사람이 보면 헷갈려할수있음 
	public void menuInfo() {
		System.out.println(this.NAME + ", " + this.PRICE + "원");
	}
	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
	
	
}
