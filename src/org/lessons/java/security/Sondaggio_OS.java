package org.lessons.java.security;

import java.util.Scanner;

public class Sondaggio_OS {

    public static void main(String[] args) {
        System.out.println("Sondaggio");
        
        int StudentiWindows; 
        int StudentiApple; 
        int StudentiLinux;
        int Studenti = 50;
        double SommaW;
        double SommaA;
        double SommaL;

        Scanner Win=new Scanner(System.in);
        System.out.print("Numero Studenti Windows: ");
        StudentiWindows=Win.nextInt();

        System.out.print("Numero Studenti Apple: ");
        StudentiApple=Win.nextInt();

        System.out.print("Numero Studenti Linux: ");
        StudentiLinux=Win.nextInt();

        SommaW = (StudentiWindows / (double) Studenti) * 100;
        SommaA = (StudentiApple / (double) Studenti) * 100;
        SommaL = (StudentiLinux / (double) Studenti) * 100;
        
        System.out.println("Percentuale studenti Windows - " + SommaW + "%");
        System.out.println("Percentuale studenti Apple - " + SommaA + "%");
        System.out.println("Percentuale studenti Linux - " + SommaL + "%");

        Win.close();
    }
}
