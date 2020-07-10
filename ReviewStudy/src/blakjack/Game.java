package blakjack;

import java.util.ArrayList;
import java.util.List;

/*
 * 게임 실행하는 Game 클래스
 * 
 * dealer 는 for문과  + dealer.moreCards(cd); 와 함께 총 3장의 랜덤카드를 받음
 * gamer  는 for문과  + gamer.moreCards(cd);  와 함께 자기가 받고싶은 만큼 랜덤카드를 받음
 * 
 */
public class Game {

		// Card c를 한이유는 실질적으로 카드정의를 한내용이 Card클래스에 있기때문에
		// Card(타입명) c(참조변수) = cd.getCard(); 즉!!
		// int a = cd.sum(1,2); 1+2 값을 정수값 a변수에 담겠다 란거랑 똑같음
		// 단지 달라진것은 타입을 클래스명으로 작성한 것(왜냐? 카드만드는게 Card클래스에 있으니)

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		dealer.moreCards(cd);
		
		gamer.moreCards(cd);
		
		Rule.whoIsWin(gamer, dealer);
		//Rule은 static이라서 굳이 상단에 생성자 안만들고 클래스명으로 메소드에 접근함
		
		System.out.println("딜러점수" + dealer.getTotalPoint());
		System.out.println("게이머점수" + gamer.getTotalPoint());
		
		
		
		
		
	}

}
