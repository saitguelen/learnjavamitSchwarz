package tag15_Array_ArrayList;

import java.util.Arrays;

public class C03_Aufgabe2_MitArraysrechnen {

    /*Aufgabe: Mit Arrays rechnen
Du hast ein Array von 5 Integer-Werten, das bestimmte Rechenoperationen durchführt. Es sollen grundlegende
mathematische Operationen mit Arrays geübt werden.
Folgendes Arrays ist gegeben:

Schritte:
1. Gebe alle Werte des Arrays über die Konsole aus.
2. Multipliziere das dritte Element mit dem zweiten Element. Überschreibe dabei den Wert des
dritten Elements mit dem Ergebnis der Multiplikation.
3. Dividiere das erste Element durch das vierte Element. Überschreibe den Wert des ersten Elements
mit dem Ergebnis der Division.
4. Falls das fünfte Element ein Teiler des dritten Elements ist, soll die Ausgabe lauten:
„5. Element ist Teiler vom 3. Element“.
5. Gebe das Array erneut
*/
    public static void main(String[] args) {
        int [] meinArray= {22,2,21,18,7};
        int[] kopie = Arrays.copyOf(meinArray, meinArray.length);//eger biz ilk listeyi korumak istiyorsak copyof metodunu kullanmaliyiz
        //arraylar referansli oldugu icin yeni atatigimizda güncel halini koruu. Yani
        //int[]kopie2= meinArray;dersem ve asagida kopie2'yi yazdirisam meinArray ile ayni sonucu alirim


        //1. Gebe alle Werte des Arrays über die Konsole aus.

        for(int arr : meinArray){
            System.out.print(arr+" ");//22 2 21 18 7


        }
        System.out.println();
        //2. Multipliziere das dritte Element mit dem zweiten Element. Überschreibe dabei den Wert des
       //   dritten Elements mit dem Ergebnis der Multiplikation.
        meinArray[2]=meinArray[1]*meinArray[2];

        //3. Dividiere das erste Element durch das vierte Element. Überschreibe den Wert des ersten Elements
        //mit dem Ergebnis der Division

        meinArray[0]= meinArray[0]/meinArray[3];

        //4. Falls das fünfte Element ein Teiler des dritten Elements ist, soll die Ausgabe lauten:
        if(meinArray[2]%meinArray[4]==0){
            System.out.println("5. Element ist Teiler vom 3. Element");
        }

        //5. Gebe das Array erneut
        System.out.println("Erste Liste:");
        for (int zahl1: kopie){
            System.out.print(zahl1+" ");
        }
        System.out.println();
        System.out.println("Aktualisierte Liste: ");
        for(int zahl: meinArray){
            System.out.print(zahl+" ");
        }



    }
}
