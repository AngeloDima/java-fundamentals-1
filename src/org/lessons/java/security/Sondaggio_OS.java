package org.lessons.java.security;

public class Sondaggio_OS {

	public static void main(String[] args) {
		System.out.println("Sondaggio");
		
		
		int SommaW;
		int SommaA;
		int SommaL;
		
		
		int Studenti = 45;
		
		int StudentiWindows = 30;
		int StudentiApple = 10;
		int StudentiLinux = 5;
		
		
		SommaW = Studenti * StudentiWindows / 100;
		SommaA = Studenti * StudentiApple / 100;
		SommaL = Studenti * StudentiLinux / 100;
		
		System.out.println(SommaW + "% Windows" );
		System.out.println(SommaA + "% Apple");
		System.out.println(SommaL + "% Linux");
				
		
		
	}

}
