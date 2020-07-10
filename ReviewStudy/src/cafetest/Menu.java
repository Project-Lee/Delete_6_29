package cafetest;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> menus;
	
	public Menu() {
		init();
	}
	
	public void init() {
		menus = new ArrayList();
		menus.add(new MenuItem("아메리카노",1500));
		menus.add(new MenuItem("카푸치노",2000));
		menus.add(new MenuItem("카라멜 마끼야또",2500));
		menus.add(new MenuItem("에스프레소",2500));
		
	}
	
	public void showMenus() {
		for(int i=0; i<menus.size(); i++) {
			System.out.printf("%d, %s\n",i+1,menus.get(i));
		}
	}
	
	public MenuItem choose(int n1) {
		return menus.get(n1);
	}
}
