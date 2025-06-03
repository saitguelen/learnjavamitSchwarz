package tag15_Array_ArrayList;

public class C04_Aufgabe3_MinMax {
    /*Seite 2 von 2
Aufgabe 1: Das Minimum und Maximum mit Array herausfinden
Es gibt ein Array von Integer-Zahlen, aus dem der maximale und der minimale Wert ermittelt werden
sollen. Anschließend werden diese Werte in einem Dialogfenster ausgegeben.*/
    public static void main(String[] args) {

        int [] zahlen = {5,2,10,9,12,3};
        int max= zahlen[0];
        int min = zahlen[0];
        for (int zahl : zahlen){

            if(max<zahl){
                max=zahl;
            }else if (min>zahl){
                min=zahl;
            }

        }
        System.out.print("Der Such-Array beträgt: ");
        for (int zahl1:zahlen){
            System.out.print(zahl1+" ");

        }
        System.out.println();
        System.out.println("Der Max-Wert beträgt: "+max);
        System.out.println("Der Min-Wert beträgt: "+min);



    }
}
