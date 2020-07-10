package cafetest;

import java.util.Scanner;

public class Customer {
	Scanner scan = new Scanner(System.in);
	
	public MenuItem order(Menu menu) {
		menu.showMenus();
		while(true) {
			try {
							
				System.out.print("메뉴 번호 입력 : ");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				MenuItem mi = menu.choose(intMenuNo - 1);
				
				return mi;
			} catch (Exception e) {
				System.out.println("메뉴 잘못선택");
			}
			
		}
	}
	
	
	
}
