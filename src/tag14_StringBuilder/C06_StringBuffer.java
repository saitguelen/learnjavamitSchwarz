package tag14_StringBuilder;

import java.util.Scanner;

public class C06_StringBuffer {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Satz ein: ");
        String eingegeben = scanner.nextLine();

        StringBuilder sb = new StringBuilder(eingegeben);

        System.out.println("1) Eingegeben " + sb);

        // reverse
        sb.reverse();
        System.out.println("2) Umgekehrt " + sb);

        // 2.  '>>> ' hinzufügen
        sb.insert(0, ">>> ");
        System.out.println("3)Zu Beginn hinzugefügt: " + sb);

        // 3. 5. nach Zeichen löschen
        if (sb.length() > 10) {
            sb.delete(5, 10);
            System.out.println("4) Einige Charaktere wurden gelöscht: " + sb);
        }

        // 4. Ersetzen Sie die ersten 3 Zeichen durch '***'.
        if (sb.length() >= 3) {
            sb.replace(0, 3, "***");
            System.out.println("5) Die ersten 3 Zeichen geändert wurden" + sb);
        }
        System.out.println(eingegeben);

        scanner.close();
    }
}

