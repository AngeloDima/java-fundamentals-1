package org.lessons.java.security;

public class Cibi_preferiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] CibiPreferiti = {"Pizza", "Panino con carne di cavallo", "gelato", "Patate" ,"Pollo"};
		
		//System.out.println("Lunghezza Array: " + CibiPreferiti.length + " elementi");
		//System.out.println("Cibo super preferito " + CibiPreferiti[0]);
		//System.out.println("Cibo meno preferito " + CibiPreferiti[4]);

		for (int i = 0; i < CibiPreferiti.length; i++) {
			 if (i == 0) {
				 System.out.println("Cibo super preferito: " + CibiPreferiti[i]);
			     
		      }
	     }
		for (int i = 0; i < CibiPreferiti.length; i++) {
		    if (i == CibiPreferiti.length - 1) {
		        System.out.println("Cibo meno preferito: " + CibiPreferiti[i]);
		        
		    }
		}
  }
}
