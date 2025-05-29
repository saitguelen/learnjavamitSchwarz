package tag13_ZeichenKetten;

import java.util.Arrays;
import java.util.Scanner;

public class C09_Aufgabe9_InitialenFindermitSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie bitte Ihren vollständigen Namen ein: ");
        String name = scanner.nextLine();

        String[] teile = name.split(" ");
        System.out.println(Arrays.toString(teile));

        StringBuilder initialen = new StringBuilder();
        for(String wort:teile){
            if(!wort.isEmpty()){
                initialen.append(Character.toUpperCase(wort.charAt(0))).append(" ");//Nimmt den ersten Buchstaben jedes Wortes
                //Character.toUpperCase(...)	Wandelt Buchstaben in Großbuchstaben
                /*teile arrayindeki her kelimeyi gez ve ilk karakteri al ve büyük harf yaz*/
            }
        }
        System.out.println(name+ "==>"+"Ihre Initialen: "+initialen.toString().trim());
    }
}
