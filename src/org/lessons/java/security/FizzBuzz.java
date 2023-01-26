package org.lessons.java.security;

import java.util.Random;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scrivo da 1 a 100
		
		for (int numeri = 0; numeri < 100; numeri++) {
			
		//Multipli di 3 e 5 stampo FizzBuzz
		if (numeri % 3 == 0 && numeri % 5 == 0) {
			System.out.println("il tuo numero è " + numeri + " FizzBuzz");
			
			//Multipli di 3 e 5 stampo Buzz
		} else if (numeri % 5 == 0) {
			System.out.println("il tuo numero è " + numeri + " Buzz");
		} else if (numeri % 3 == 0) {
			
			//Multipli di 3 e 5 stampo Fizz
			System.out.println("il tuo numero è " + numeri + " Fizz");
		} else {
			System.out.println("il tuo numero è " + numeri);
		}
	 }
  }

}
