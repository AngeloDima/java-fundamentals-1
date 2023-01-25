package org.lessons.java.security;

import java.util.Scanner;

public class Sondaggio_OS {

	public static void main(String[] args) {
		System.out.println("Sondaggio");
		
		
		int SommaW;
		int SommaA;
		int SommaL;
		
		
		int Studenti = 100;
		
		int StudentiWindows; 
		int StudentiApple; 
		int StudentiLinux;
		
		
		Scanner Win=new Scanner(System.in);
		System.out.print("Numero Studenti Windows");
		
		StudentiWindows=Win.nextInt();
		SommaW = Studenti * StudentiWindows / 100;
		
		
		System.out.print("Numero Studenti Apple");
		
		StudentiApple=Win.nextInt();
		SommaA = Studenti * StudentiApple / 100;
		
		System.out.print("Numero Studenti Linux");
		StudentiLinux=Win.nextInt();
		SommaL = Studenti * StudentiLinux / 100;
		
	
		System.out.println("Percentuale studenti Windows - " + SommaW + "%");
		System.out.println("Percentuale studenti Apple - " + SommaA + "%");
		System.out.println("Percentuale studenti Linux - " + SommaL + "%");
	}

	
}
