package tag14_StringBuilder;

import java.util.Scanner;

public class C03_Ubung1_Satzbuilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder satz = new StringBuilder();;
        System.out.print("Word eingeben (Geben Sie 'Ende' ein, um fertig zu werden):");

        while(true){
            String word = scanner.nextLine();
            if(word.equalsIgnoreCase("Ende")){
                break;
            }
            satz.append(word).append(" ");
        }
        System.out.println("Neu Satz:");
        System.out.println(satz.toString());
    }
}
