package cafe;

import java.util.ArrayList;
import java.util.List;

// MenuItem 으로 직접 값을 넣어주는 클래스
// MenuItem 과 Menu 클래스간의 ☆관계를 아주 명확하게 이해하는게 필요!!☆
// List<MenuItem> <-- 이렇게 했기에 menus 는 MenuItem으로 값을 넣어줌
// 
// 즉, 팩트는 클래스만 다르게하였고 상속안받았지만,
// 결국 MenuItem에 작성해도 될것을 Menu라는 또다른 클래스를 만든것 뿐이다라고 생각
public class Menu {
	
	// MenuItem 타입 arr 선언
	private List<MenuItem> menus;
	
	
	
	
	// Menu 생성자
	public Menu() {	
		init(); 
	}
	
	
	
	
	
	// MenuItem 클래스 arr 1번방에 아메리카노 2번방 카푸치노 값을 넣겠다란 뜻
	public void init() {
		
		// arr을 ArrayList()로 사용하겠다 
		menus = new ArrayList();
		menus.add(new MenuItem("아메리카노",1500));
		menus.add(new MenuItem("카푸치노",2000));
		menus.add(new MenuItem("카라멜 마끼야또",2500));
		menus.add(new MenuItem("에스프레소",2500));
	}
	
	
	
	
	
	
	
	/*
	 * 메뉴판 보여주는 방법 총 3가지 메소드
	 */
		
	// 레퍼런스 란 ? : ex) 기본형 제외한 나머지, String, class명 등등.. 주소값 가지고있는 거
	// 래퍼러스 타입으로 이루어진 배열의값을 출력하는방법
	
	//////////////앞에 메뉴판 1,2,3,4 숫자없이 출력하려면 toString();//////
	@Override
	public String toString() {
		String str = "";
		
		for(MenuItem val : menus) {
			System.out.println(val);
			str += val + "\n";
		}
		return str;
	}
	
	///////////// 메뉴판 1,2,3,4 숫자넣어서 출력하려면 showMenus();/////////
	public void showMenus() {
		for(int i=0; i<menus.size(); i++) {
			System.out.printf("%d, %s\n",i+1,menus.get(i));
		}
	}
	///////////////////////////////////////////////////////////
	
	// ☆이것도 유심히보기 << >>
	public void showMenus1() {
		System.out.println("      Menu ");
		for(int i=0; i<menus.size(); i++) {
			MenuItem mi = menus.get(i);
			System.out.printf("%d. %s\n",i+1,menus.get(i));
		}
	}
	///////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	// menus 리스트의 n번째 값을 출력하는 메소드
	// 타입은 MenuItem 으로했음 (왜냐 ? 실질적으로 값들은 MenuItem에 넣어놨으니까
	// List<MenuItem> <-- 이걸로인해 Menu에서 생성된 menus배열은 MenuItem
	// 쪽으로 값을 넣어주는 역활함
	public MenuItem choose(int n1) {
		return menus.get(n1);
	}
	
	
	
	
	
}
