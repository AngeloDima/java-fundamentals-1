package org.lessons.java.security;

import java.util.Scanner;

public class Festa_Ferragnez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] InvitatiArray = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };
		String nomeUtente;
		boolean trovato = false;
		
		//Chiedere il nome all'utente e verificare se è presente nella Array
		
		Scanner s= new Scanner(System.in);
		System.out.print("Come ti chiami?");
		nomeUtente=s.nextLine();
		
		for (int i=0; i<InvitatiArray.length; i++) {
			if (InvitatiArray[i].equals(nomeUtente)) {
				trovato = true;
				break;
			}
		}
		
		if (trovato) {
			System.out.println("Nome trovato, puoi entrare");
		} else {
			System.out.println("Nome non trovato, vai all'anagrafe e cambia nome");
		}
	}

}
