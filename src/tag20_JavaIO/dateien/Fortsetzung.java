package tag20_JavaIO.dateien;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Fortsetzung {

    public static void main(String[] args) {
        // Infos über das Betiebssystme/Filesysteme

        FileSystem fileSystem = FileSystems.getDefault();//sun.nio.fs.MacOSXFileSystem@299a06ac
        System.out.println(fileSystem);
        //Auf Windows: sun.nio.fs.WindowsFileSystem@68837a77

        //File-Klasse aus java io.
        //Wenn es um das Thema lesen und schreiben geht, benötigt man andere Klassen (Streams)

        File file = new File("/Users/Schwarz/Desktop/text.txt");

        //Überprüfen ob diese Datei überhaupt existiert.
        boolean fileExistiert = file.exists();

        if(fileExistiert)
            System.out.println("Datei vorhanden");
        else
            System.out.println("Datei nicht vorhanden.");//Datei vorhanden

        //File Länge oder Größe --> Info wird in Byte zurückgegeben
        long laenge = file.length();
        System.out.println("Dateigröße in Byte: " + laenge);

        //Ist das eine Datei oder ein Ordner?
        //Es gibt eine Methode, die überprüft, ob es ein Verzeichnis (d.h. Ordner) ist.

        boolean istVerzeichnis = file.isDirectory();

        if(istVerzeichnis)
            System.out.println("Es ist ein Ordner");
        else
            System.out.println("Es ist lediglich eine Datei.");//Es ist lediglich eine Datei.

        //Namen ändern
        boolean aendereNamen = file.renameTo(new File("/Users/Schwarz/Desktop/schule.txt"));

        if(aendereNamen)
            System.out.println("Name geändert.");
        else
            System.out.println("Der Name konnte nicht geändert werden.");//Dateinname wurde auf schule.txt geändert.

    }

}
