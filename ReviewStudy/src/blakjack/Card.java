package blakjack;

// 카드공장( 카드를 생성하는 클래스 ) 
public class Card {
	public final static String[] PATTERNS = {"스페이드","하트","클로버","다이아"};
	
	private final String pattern; // 하트,스페이드,클로버,다이아몬드
	private final String denomination; // A=1 , 2~10,  k,j,q = 10
	private final int point;
	
	
	// 생성과 동시에 패턴,데노미네이션 에 값을 넣겠다 
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}

	
	
	// private 걸린 카드 종류를 빼내는 겟터메소드
	public String getPattem() {
		return pattern;
	}
	
	
	// private 걸린 카드 종류를 빼내는 겟터메소드
	public String getDenomination() {
		return denomination;
	}
	
	// private 걸린 포인트값을 빼내는 겟터메소드
	public int getPoint() {
		return point;
	}
	
	
	
	// 제대로들어왔는지 출력하기위한 Object 투스트링 오버라이딩 한 메소드 
	@Override
	public String toString() {
		return String.format("패턴 : %s   숫자 : %s   포인트 : %d"
				,pattern,denomination,point);
	}
}
