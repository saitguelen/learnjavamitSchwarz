package tag12_Exception;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_CustomException {
    public static void verarbeiteName(String name) throws UngueltigeBenutzereingabeException {
        if(name == null || name.trim().isEmpty()){
            throw new UngueltigeBenutzereingabeException("Name darf nicht leer sein!");
        }
        if(name.matches("\\d+")){
            throw new UngueltigeBenutzereingabeException("Name darf nicht Zahlen bestehen");
        }
        if (!name.matches("[a-zA-ZäöüÄÖÜßçğıİĞÇŞş\\s]+")) {
            throw new UngueltigeBenutzereingabeException("Name darf nur Buchstaben enthalten!");
        }
        System.out.println("Hallo, "+name+ "!");


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Namen ein: ");
        String name1 = scanner.nextLine();

        try{
            verarbeiteName(name1);
        } catch (UngueltigeBenutzereingabeException e) {
            System.out.println("Fehler: "+ e.getMessage());
        }
    }
}
