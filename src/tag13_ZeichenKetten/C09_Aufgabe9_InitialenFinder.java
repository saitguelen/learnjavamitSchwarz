package tag13_ZeichenKetten;

import java.util.Scanner;

public class C09_Aufgabe9_InitialenFinder {

    /*Schreiben Sie ein Java-Programm, das die Initialen von Ihrem ganzen Namen bestimmt und in der Konsole ausgibt.
Verwenden Sie einen String für Ihren Namen.
Sie können z.B. eine for-Schleife schreiben, die den String Zeichen für Zeichen durchgeht.
Innerhalb der Schleife verwenden Sie einen StringBuilder, der die Initialen aus Ihrem vollen Namen mithilfe der Methode append() aufnimmt.

Beispiel:
"Max Karl Mustermann" → M K M
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie bitte Ihren vollständigen Namen ein: ");
        String name = scanner.nextLine();

        StringBuilder initialen = new StringBuilder();//Erstellen eines StringBuilders zum Sammeln der Initialen.
        //erstes Zeichen immer als Initiale nehmen(sofern ken leerzeichen)

        if(!name.isEmpty()){
            initialen.append(Character.toUpperCase(name.charAt(0))).append(" ");
        }

        //Mit Schleife restliche Initialen suchen

        for (int i =1;i<name.length();i++){
            if(name.charAt(i-1)==' '&& name.charAt(i) != ' '){
                //Wenn vorher ein leerzeichen war nächstes Zeichen ist Initiale
                initialen.append(Character.toUpperCase(name.charAt(i))).append(" ");

                /*	' '	'a'	✅	'A' --->bosluk sonra 'a' gelmis bu olur
                	' '	'y'	✅	'Y'
                	eger bosluktan sonra harf gelirse ilk harfi al*/
            }
        }

        System.out.println(name+ "==>"+"Ihre Initialen: "+initialen.toString().trim());
    }

}
