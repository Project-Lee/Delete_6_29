package blakjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 게이머1이 카드덱에서 나온 카드를 받는 게이머 
public class Gamer {
	Scanner scan = new Scanner(System.in);
	private List<Card> arr;

	public Gamer() {
		arr = new LinkedList();
		// arr = new ArrayList();
		// ArrayList나 LinkedList나 큰차이없음
		// LinkedList = 수정이 용이하다
		// ArrayList = 값을 계속 확인하는 것이 용이하다
	}

	// 점수 합산하는 변수 // openCard() 메소드에 사용할 변수

	// CardDeck 클래스에 getCard()를 해서
	// CardDeck에 카드한장 지우고 나한테 카드한장 넣는 메소드
	public void receiveCard(Card card) {

		// 어떻게 랜덤값이 들어오느냐 ?
		// CardDeck 클래스에 getCard() 메소드가 작동하여
		// main 메소드에서 receiveCard(cd.getCard())를 적용
		// arr.add(card) (card) <-- 이부분은 다른타입의 어떤 메소드를 받겠다는 뜻
		arr.add(card);

	}

	// 점수만 누적시키는 메소드
	public int getTotalPoint() {
		int sum = 0;
		for (Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}

	// 내가 가지고 있는 카드값 과 점수를 출력하는 메소드
	public void openCards() {
		for (Card card : arr) {
			System.out.println(card);
		}
		System.out.println("총합 : " + getTotalPoint());

	}

	// moreCards 내방법
//	public void moreCards(CardDeck cd) {
//		while (true) {
//			System.out.println("1.받기  /  2.종료");
//			int num = scan.nextInt();
//
//			if (num == 1) {
//				receiveCard(cd.getCard());
//				openCards();
//			} else {
//				openCards();
//				break;
//			}
//		}
//	}

	// moreCards 샘 방법
	public void moreCards(CardDeck cd) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("카드 더받겠나 ? (y/n)");
			String answer = scan.nextLine();

			if (answer.equals("n") || answer.equals("N") || getTotalPoint() > 21) {
				break;
			} else if (answer.equals("y") || answer.equals("Y") ) {
				receiveCard(cd.getCard());
				openCards();
			}
		}
		scan.close();
	}
	
	public void showPoint(CardDeck cd) {
		
	}
}
