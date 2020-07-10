package com.koreait.second;

import java.util.Scanner;

class TTT {
	private String name;
	private int number2;
	
	public TTT(String name, int price) {
		this.name = name;
		number2 = price;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
		
}

class Buyer extends TTT {
	public Buyer() {
		super("Tv",200);
	}
}

public class Try_CatchTest {

	public static void main(String[] args) {
		
		
		 
	}

}
