package com.koreait.second;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

	// 정렬 배열 (2번째 매개변수값 true = 오름차순 / false = 내림차순)
	public static void sort(int[] arr, boolean asc) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (asc == (arr[i] > arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	
	// 내림차순 정렬
	public static void sortAsc(int[] arr, boolean asc) {
		sort(arr, true);
	}

	
	// 오름차순 정렬
	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}

	
	// 배열값 출력하기
	public static void printArr(int[] arr) {
		for (int val : arr) {
			System.out.print(val);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 5, 4 };

		Sort.sortAsc(arr, false);
		Sort.printArr(arr);
		System.out.println();
		Sort.sortDESC(arr);
		Sort.printArr(arr);

	}

}
