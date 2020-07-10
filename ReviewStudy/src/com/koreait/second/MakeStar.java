package com.koreait.second;

public class MakeStar {

	public static String makeStarTriangle(int star) {
		String str = "";
		for(int i=0; i<star; i++) {
			for(int z=0; z<=i; z++) {
				str += "*";
			}
			str += "\n";
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		
		System.out.println(makeStarTriangle(5));

	}

}
