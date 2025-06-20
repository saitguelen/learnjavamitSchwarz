package tag20_JavaIO.dateien;


import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

    public static void main(String[] args) {
        // Umgang mit Dateien in Java
        //Paket auf java.nio nutzen
        //Pfand als String angeben

        Path path = Paths.get("/User/Schwarz/Desktop/test.txt");
        //Windows C: \\home\\user\\Desktop\\text.txt

        //Methoden
        System.out.println("toString: " + path.toString());//toString: /User/Schwarz/Desktop/text.txt
        System.out.println("getFilenName: " + path.getFileName());//getFilenName: text.txt
        System.out.println("getName " + path.getName(3));//User, hier kann man über einen Index angeben,
        //wo man in der Baumstruktur "anfangen" möchte
        System.out.println("getNameCount: " + path.getNameCount());//4
        //Bestimmte Ausschnitte vom Dateipfad ausgeben
        System.out.println("subPath: " + path.subpath(0, 2));// User/Schwarz

        System.out.println("getParent" + path.getParent());///User/Schwarz/Desktop
        System.out.println("getRoot" + path.getRoot());// bei mac ist des der /
        System.out.println("absolutePath: " + path.toAbsolutePath());

    }

}

