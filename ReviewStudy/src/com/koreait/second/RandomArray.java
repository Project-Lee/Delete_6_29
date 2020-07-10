package com.koreait.second;

import java.util.Arrays;

// 각각 유동적으로 랜덤값이 n1 ~ n9까지 하고 배열 칸수는 num으로 함

public class RandomArray {

	// 1번 문제
	// n1 부터 n2까지 랜덤값 을 총 num칸 만큼 배열로 만드는 메소드
	public static int[] createRandomArr(int n1, int n2, int num) {
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = (int) (Math.random() * (n2 - n1 + 1) + n1);
		}

		return arr;
	}

	
	
	
	
	// 2번 문제
	// n1 부터 n2까지 랜덤값 을 총 num칸 만큼 '중복되지않게' 출력하는 메소드
	public static void createRandomArrNoDuplication(int n1, int n2, int num) {
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * (n2 - n1 + 1) + n1);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}

	
	
	
	
	// 3번문제
	// 랜덤한 숫자가 나올수 있는 범위보다 큰 칸을 요구하는 경우 null을 리턴 
	// 즉 5 ~ 15 는 총 11개 랜덤값이 나오는데 마지막 방칸수가 남으면 그값들은 null로 출력하기 
	public static int[] createRandomNull(int n1, int n2, int num) {
		
		int[] a = new int[num];
		if((n2-n1+1) < (num)) {
			return null;
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * (n2 - n1 + 1) + n1);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
				
			}
		}

		return a;
	}
	
	


	public static void main(String[] args) {

		// 1번 문제
		// return 메소드, 5~15까지 랜덤한값 10칸 들어간 메소드
		// 배열 칸수가 유동적으로 변경되야 하기때문에 값은 null줌
		int[] result = null;
		result = createRandomArr(15, 5, 10);
		System.out.println(Arrays.toString(result));

		
		
		
		// 2번문제
		// void로 바로 출력하는 메소드
		// 5 ~ 15까지 랜덤값이 총 8칸 생성되어 중복되지 않게 값 출력하기
		createRandomArrNoDuplication(5, 15, 8);
		
		
		
		
		// 3번문제
		int[] result2 = createRandomNull(5, 15, 11);
		System.out.println(Arrays.toString(result2));
		
		

	}

}
