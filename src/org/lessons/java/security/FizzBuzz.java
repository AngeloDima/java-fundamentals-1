package org.lessons.java.security;

import java.util.Random;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scrivo da 1 a 100
		
		Random generatore = new Random();
		int numeri = generatore.nextInt(100)+1;
		System.out.println(numeri);
	}

}
