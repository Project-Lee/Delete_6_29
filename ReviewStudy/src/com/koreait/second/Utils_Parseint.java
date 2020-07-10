package com.koreait.second;

public class Utils_Parseint {

	// 매개변수 문자,정수 받고 문자를 문자열안에 숫자만 있을경우 '숫자리턴'
	// 문자열안에 문자 + 숫자가 있으면 두번째 '정수값리턴'

	// 파싱기법 (만약 문자열중 숫자만 받을경우 숫자리턴, 그게아니라면 n2값 리턴)
	public static int parseStringtoInt(String n1, int n2) {

		int result;
		try {
			result = Integer.parseInt(n1);
			return result;
		} catch (Exception e) {
			return n2;
		}

	}

	
	// parseStringtoInt (총 2개 오버로딩)
	// 문자열중 숫자만 받으면 n1값 리턴, 문자 + 숫자 섞여있으면 0을 리턴
	public static int parseStringtoInt(String n1) {

		int result;
		try {
			result = Integer.parseInt(n1);
			// 또는 return Integer.parseInt(n1);
			return result;
		} catch (Exception e) {
			return 0;
		}

	}
	
	
	
//	// 샘이 작성한 정답 방법
//	public static int parseStringtoInt(String str, int num) {
//		int result = num;
//		try{
//			result = Integer.parseInt(n1);
//		} catch (Exception e) {}
//		
//		return result;
//	}

	
	public static void main(String[] args) {

		// 문자열을 숫자로 바꿈
		int result1 = Utils_Parseint.parseStringtoInt("100", 1);
		int result2 = Utils_Parseint.parseStringtoInt("a10a3124a", 1);
		int result3 = Utils_Parseint.parseStringtoInt("a10a3124a");		
		int result4 = Utils_Parseint.parseStringtoInt("9");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
