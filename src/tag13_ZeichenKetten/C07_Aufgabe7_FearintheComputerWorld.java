package tag13_ZeichenKetten;

import java.util.Scanner;

public class C07_Aufgabe7_FearintheComputerWorld {
    /*The Y2K problem was that many thousands of old software systems around the world had
been using only two digits for the year in stored dates. It was feared that on January 1, 2000,
those dates were likely to be misinterpreted by the software as being January 1, 1900, thus
causing unpredictable errors and system crashes.
Write a Java program that inputs a date in the form mm/dd/yy and outputs in the expanded
form mm/dd/19yy. For example, the input 06/30/98 would be printed 06/30/1998.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein Datum im Format mm/dd/yy ein; "); //06/30/98
        String datum = scanner.nextLine();

        String[] teilen = datum.split("/");

        if(teilen.length!=3){
            System.out.println("Ungültiges Format! Bitte mm/dd/yy eingeben.");
            return;
        }

        String monat =teilen[0];
        String tag = teilen[1];
        String jahr = teilen[2];

        String neuesDatum = monat+"/"+tag+"/"+"/19"+jahr;

        System.out.println("Umgewandeltes Datum: "+neuesDatum);


    }
}
