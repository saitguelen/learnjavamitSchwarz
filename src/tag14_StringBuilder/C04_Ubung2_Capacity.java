package tag14_StringBuilder;

public class C04_Ubung2_Capacity {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        System.out.println("Startkapazität:"+str.capacity());// Startkapazität:16
        System.out.println(str.length());//0

        str.append("Java");
        System.out.println("4 Zeichen hnzugefügt.==> Neukapazität:"+str.capacity());//4 Zeichen hnzugefügt.==>Neukapazität:16
        System.out.println(str.length());//4

        str.append("ist eine lustige Sprache!");
        System.out.println("Länge Satz hinzugefügt. ==> Letztekapazität: "+str.capacity());//Länge Satz hinzugefügt. ==> Letztekapazität:34
        System.out.println(str.length());//29

        str.trimToSize();// unnötige kapazität abbauen-reduzieren
        System.out.println("Kapazität Nach dem Trim: "+str.capacity());//Kapazität Nach dem Trim: 29

    }
}
