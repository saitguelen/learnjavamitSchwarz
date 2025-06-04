package tag15_Array_ArrayList;

import java.util.Arrays;
import java.util.Random;

public class C09_Aufgabe6_ArrayOperationen {
    /*Aufgabe : Array-Operationen mit der Arrays-Klasse und Zufallszahlen
Es gibt ein Array von Integer-Werten, das mit Zufallszahlen gefüllt und anschließend mit verschiedenen
Methoden der Arrays-Klasse bearbeitet werden soll.
Erläuterung zur Klasse Random:
Die Klasse Random aus dem Paket java.util kann verwendet werden, um Zufallszahlen zu generieren.
Mit der Methode nextInt(obergrenze) lässt sich eine Zahl zwischen 0 und (obergrenze-1)
erzeugen. Um beispielsweise eine Zufallszahl zwischen 1 und 100 zu erhalten,
kann nextInt(100) + 1 verwendet werden.
Anforderungen:
1. Ein Array von 10 Integer-Werten soll mit Zufallszahlen zwischen 1 und 100 gefüllt werden. Verwende
hierfür die Klasse Random.
2. Das Array soll mit der Methode Arrays.sort() sortiert werden.
3. Die Methode Arrays.fill() soll verwendet werden, um die ersten drei Werte im Array auf
einen festen Wert (z. B. 0) zu setzen. Danach soll das gesamte Array erneut ausgegeben werden.
4. Die Methode Arrays.binarySearch() soll genutzt werden, um nach einem bestimmten
Wert im Array zu suchen. Die Methode gibt den Index des Wertes zurück, wenn dieser gefunden
wurde. Ist der Wert nicht vorhanden, wird ein negativer Wert zurückgegeben. Suche dir eine
Zahl in deinem Zufallszahlen – Wertebereich aus zum Suchen.
5. Ein zweites Array soll erstellt und mit denselben Werten wie das erste Array (vor der Änderung
durch fill()) gefüllt werden. Beide Arrays sollen mit Arrays.equals() verglichen und
das Ergebnis ausgegeben werden.
6. Verwende Arrays.mismatch(), um die erste Stelle zu finden, an der die beiden Arrays
unterschiedlich sind.*/

    public static void main(String[] args) {
        Random rand = new Random();

        // 1. Schritt : 10-elementige Zufallszahlenfolge (1-100)

        int[] arr = new int[10];
        for(int i=0; i<arr.length;i++){
            arr[i]=rand.nextInt(100)+1;
        }
        //2. Schritt : Original Copy  speichern

        int[] original = Arrays.copyOf(arr,arr.length);
        System.out.println("Original List: "+Arrays.toString(arr));

        // 3. Schritt = Sortieren List
        Arrays.sort(arr);
        System.out.println("Sortierte List: "+Arrays.toString(arr));

        // 4. Schritt: Weisen Sie den ersten 3 Elementen 0 zu mit fill() methode
        Arrays.fill(arr,0,3,0);
        System.out.println(" die ersten 3 Elemente durch 0 ersetzt werden:"+ Arrays.toString(arr));

        // 5. Schritt : Such mit binary search eines Element

        int suchwert =50;
        int index= Arrays.binarySearch(arr, suchwert);
        if(index>=0){
            System.out.println(suchwert+ " Wert  ist "+ index+ ". index gefunden.");
        }else{
            System.out.println(suchwert+ " ist leider nicht gefunden!!");
        }
        // 6. Schritt:  Sind Ankunft und Original identisch?

        boolean gleich= Arrays.equals(arr,original);
        System.out.println("Sind Ankunft und Original identisch? "+ gleich);

        // 7. Schritt: Mismatch
        int mismatchIndex = Arrays.mismatch(arr, original);
        if (mismatchIndex >= 0) {
            System.out.println("Erste Unterschied " + mismatchIndex + ". indexte.");
        } else {
            System.out.println("Die beiden Arrays sind genau gleich");
        }

    }
}
