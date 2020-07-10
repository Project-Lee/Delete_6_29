package cafe;

import java.util.Scanner;

public class Customer {
	Scanner scan = new Scanner(System.in);
	
	// ☆ 집가서읽어보기 ☆~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// 메뉴선택하면 그 메뉴 리턴
	// Menu 클래스안에 있는 choose 메소드는 결국 MenuItem에 있는 멤버필드값들을
	// 반환하니까 그냥 타고타고 계속 역추적 하면 됨 (리턴값 -> MenuItem)
	// 팩트는! 결국 MenuItem에있는 값들을 사용하기위해서 우리가 여태
	// Customer 과 Menu 이딴거 만든거임 결국 MenuItem이 지혼자 못하니까 우리가 돕기위해 하는짓
	// ☆MenuItem 클래스 멤버필드값들이 캡슐화(은닉화 private) 되어있어서
	// 또한 실제로 MenuItem에서 다 처리할수있는 내용들이지만 클래스들로 구분지어서
	// 이클래스는 -이런 역활을 담당하고자해서 클래스를 다 세분화 시킨것임
	// 간단하게 생각하자
	
	public MenuItem order(Menu menu) {
		
		menu.showMenus();
		while (true) {
			try {
				System.out.print("메뉴 번호 입력 : ");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				MenuItem mi = menu.choose(intMenuNo - 1);
				
				return mi;

			} catch (Exception e) {
				System.out.println("메뉴선택 잘못");

			}
		}
		////////////////////////////////////////////////////////
	}
	
	public void drinkCoffee(Coffee co) {
		System.out.println(co.getName() + "을 마신다");
	}
	
	
}