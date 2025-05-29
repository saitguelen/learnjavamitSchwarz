package tag05_staticheMethode;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*; //oder verwenden wir import static java.lang.Math.pow;

public class EingabevonBenutzermitStatischeMethode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine negative Zahl ein: ");
        int zahl = scanner.nextInt();

        double abs = Math.abs(zahl);
        double sin = Math.sin(abs);
        double potenz = pow(zahl, 2);//Wir müssen import machen, damit direkt pow verwenden

        System.out.println("Die eingegene Zahl für abs: " + abs);
        System.out.println("Die eingegeben Zahl für sin: " + sin);
        System.out.println("Die  Zahl hoch 2 ist: " + potenz);
        System.out.println(ganze(zahl));
        System.out.println(fakultaet(zahl));
        analysiere5Zahlen();
    }

    //Eigene Method
    public static String ganze(double zahl) {
        if (zahl % 2 == 0)
            return "Die Zahl ist gerade  Zahl";

        return "Die Zahl ist ungerade Zahl";


    }

    public static int fakultaet(int zahl) {
        if (zahl < 0) {
            int zahl1 = abs(zahl);//Math method verwende ich direkt
            int ergebnis = 1;
            for (int i = 1; i <= zahl1; i++) {
                ergebnis *= i;


            }
            return ergebnis;


        } else {
            int ergebnis1 = 1;
            for (int j = 1; j <= zahl; j++) {
                ergebnis1 *= j;
            }
            return ergebnis1;
        }


    }

    public static void analysiere5Zahlen() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Geben Sie bitte Erste Zahl ein:");
        int zahl1 = scr.nextInt();

        System.out.println("Geben Sie bitte Zweite Zahl ein:");
        int zahl2 = scr.nextInt();

        System.out.println("Geben Sie bitte Dritte Zahl ein:");
        int zahl3 = scr.nextInt();

        System.out.println("Geben Sie bitte Vierte Zahl ein:");
        int zahl4 = scr.nextInt();

        System.out.println("Geben Sie bitte Fünfte Zahl ein:");
        int zahl5 = scr.nextInt();

        int maximum= max(zahl1, max(zahl2, max(zahl3, max(zahl4, zahl5))));
        int minimum = min(zahl1,min(zahl2, min(zahl3,min(zahl4,zahl5))));
        int summe=zahl1+zahl2+zahl3+zahl4+zahl5;
        double durchschnitt= summe/5.0;
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Durchschnitt: " + durchschnitt);

    }


    }
