package com.koreait.second;

public class MethodParameter {

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	// 매개변수를 int[] arr 로하면 에러남       가변인자식으로 int... arr 이런식으로 받아야됨 
	public static int sum(int... arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
				
		return sum;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int sum1 = sum(1,2);
		int sum2 = sum(1,2,3);
		int sum3 = sum(1,2,3,4,5,6,7,8,98,1,2,3,4); //... 계속 받는대로 됨 
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}

}
