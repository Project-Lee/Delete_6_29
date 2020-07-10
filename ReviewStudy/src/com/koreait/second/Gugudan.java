package com.koreait.second;

// 매개변수 n1 ~ n2까지 구구단 출력하는 코드 
// 추가+) 답이 짝수만 출력되도록 
public class Gugudan {

	public static void gugudan(int n1, int n2) {

		for (int i = n1; i <= n2; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				if(result % 2 == 0) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}

			}
		}
	}

	public static void main(String[] args) {


	}

}
