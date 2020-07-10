package blakjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	// List<Card> <-- < > 꺽쇠부분이 제네릭  즉, Card 클래스 타입만 넣겠다
	private List<Card> arr = new ArrayList();
	

	// 모든카드 각 카드종류를 만들어내는 생성자
	public CardDeck() {
		init(); // 밑에 init메소드를 만들어놨음 생성자 생성하면 init메소드 실행됨
		
	}
	
		
	// 각 카드종류 한개에 모든 값들을 다 넣는 init()메소드
	// arr.add~~ 이부분은 직접 생성자Card안에 첫번째값 PAT..  두번째매개변수 getDeno넣겠다는 것
	private void init() {
		
		for(int i=0; i<Card.PATTERNS.length; i++) {
					
			for(int z=1; z<=13; z++) {
				
				// [값 들어가는지 확인 코드] 
				//System.out.printf("%s = %s\n",Card.PATTERNS[i],getDeno(z));
				arr.add(new Card(Card.PATTERNS[i], getDeno(z), getPoint(z)));
						
				// ↑ 위에코드 뜻풀이해석 :
				// arr.add <-- add는 List가 가지고 있는 메소드임
				// Card 생성자 (매개변수1 : Card.Patterns  매개변수2 : getDeno)
				
				
				// 위에 내용을 풀어서 작성하면
				// String pattern = Card.PATTERNS[i];
				// String deno = getDeno(z);
				// Card c = new Card(pattern, deno);
				// arr.add(c); 
			} 
		}
	}
	
	
	
	// 카드값을 출력하는 메소드
	private String getDeno(int num) {
		switch(num) {
			case 1:	return "A";
			case 11: return "J";
			case 12: return "Q";
			case 13: return "K";
			default: return String.valueOf(num);
		}
		
	}
	
	
	
	// 카드를 출력하는 투스트링 메소드 
	@Override
	public String toString() {
		for(Card c : arr) {
			System.out.print(c);
		}
		return "";
	}
	
	
	
	// 카드하나를 유저에게 주면서 동시에 그값을 삭제하고
	// 삭제된값은 반환하여 보여줌
	public Card getCard() {
		// System.out.println("삭제된값"); 궁금하면 주석 풀어보기 
		int rIdx = (int)(Math.random() * arr.size());
		
		// remove가 삭제함과 동시에 그값을 return,반환한다
		return arr.remove(rIdx);
	}
	
	
	// 각 카드 숫자마다 점수를 부여  
	// A = 1점   2~0 = n점     K,J,Q = 10점
	public int getPoint(int num) {
		return num > 10 ? 10 : num;
	}
	
	
	
}
