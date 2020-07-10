package blakjack;

import java.util.Scanner;

// 게이머에 있는 메소드, 딜러도 똑같이 받기위해 상속받음
public class Dealer extends Gamer {
	Scanner scan = new Scanner(System.in);
	
	
	
	// 내가 가지고 있는 합계 점수가 17점 이상이 될 때까지 카드 뽑기
	// 17점이 넘으면 
	
	@Override
	public void moreCards(CardDeck cd) {
		// int totalPoint = getTotalPoint();
		
		int stopPoint = 17; // 습관하자 정수값을 그대로 박기보단 
							// 값을 변수에 담아주는 습관
				
		while(getTotalPoint() < stopPoint) {
			receiveCard(cd.getCard());//매개변수에 Card객체 가 들어가야함
					// ☆☆ receiveCard메소드는 Card 소속이 아니지만 매개변수를통해
					// Card 클래스에 접근할수있음 ☆☆
			System.out.println("== 딜러카드 ==");
			this.openCards();
		}
	}
}
