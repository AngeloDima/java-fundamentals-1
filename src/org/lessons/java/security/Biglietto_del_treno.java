package org.lessons.java.security;

import java.util.Scanner;

public class Biglietto_del_treno {

	public static void main(String[] args) {

		int inputKm, inputEtà;
		
		Scanner s= new Scanner (System.in);
		
		//Chiedo Km
		System.out.print("Inserisci quanti Km vuoi percorrere = ");
		inputKm=s.nextInt();
		
		//Chiedo età
		System.out.print("Inserisci la tua età = ");
		inputEtà=s.nextInt();
		
		//Stampo dati del cliente
		System.out.println("Vuoi percorrere " + inputKm + " Km");
		System.out.println("Hai " + inputEtà + " anni");
		
		
		
		//DATO = Prezzo base per Km
		
		//DATO = 20% di sconto per minorenni
		//DATO = 40% di sconto per Over 65
		
		
		float PrezzoBase = 0.21F;
		float CalcoloBase = Math.round(inputKm * PrezzoBase);
		
		//Sconto Minorenni
		if (inputEtà <= 17) {
			float calcoloMino = Math.round(inputKm * 0.8F);
			System.out.println("il prezzo del tuo biglietto è " + calcoloMino + " $");
			
			//Sconto Maggiorenni
		}else if (inputEtà >= 65) {
			float calcoloOver = Math.round(inputKm * 0.6F);
			System.out.println("il prezzo del tuo biglietto è " + calcoloOver + " $");
			
			//Prezzo normale
		}else {
			System.out.println("Il prezzo del tuo biglietto è " + CalcoloBase + " $" );
		}
	}

}
