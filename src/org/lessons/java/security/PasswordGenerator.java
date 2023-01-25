package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		
		String Nome;
		String Cognome;
		String Colore;
		String DataDiNascita;
		
		
		//Prendo il nome
		Scanner primo= new Scanner(System.in);
		System.out.print("Inserisci il tuo nome ");
		Nome=primo.nextLine();
		

		//Prendo il Cognome
		Scanner secondo= new Scanner(System.in);
		System.out.print("Inserisci il tuo cognome ");
		Cognome=secondo.nextLine();
		
		
		//Prendo il Colore
		Scanner terzo= new Scanner(System.in);
		System.out.print("Inserisci il tuo colore preferito ");
		Colore=terzo.nextLine();
		
		
		//Prendo la Data di nascita
		Scanner finale= new Scanner(System.in);
		System.out.print("Inserisci la tua data di nascita ");
		DataDiNascita=finale.nextLine();
		

		System.out.println("La tua password è " + Nome + "-" + Cognome + "-" + Colore + "-" + DataDiNascita);
	}

}
