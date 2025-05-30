package tag14_StringBuilder;

public class C02_StringBuilderDemo2 {

    public static void main(String[] args) {
        StringBuilder test = new StringBuilder();

        System.out.println(test.capacity());//Kapazität liegt per default bei 16
        System.out.println(test.length());//Länge 0

        test.append('A').append("Haus").append("Maus");
        System.out.println(test);
        System.out.println(test.capacity());//Kapazität ist immer noch bei 16
        System.out.println(test.length()); //Länge ist bei 9

        test.append("Hallo").append("123");
        System.out.println("Kapazität : " + test.capacity());//Kapazität ist auf 34
        System.out.println("Länge des StringBuilders" + test.length()); //Länge ist bei 17
        //Wenn der StringBuilder größer wird und danach aber wieder Sachen gelöscht werden,
        //bleibt die hohe Kapazität erhalten. Wer den StringBuilder auf den tatsächlichen
        //Speicherbedarf reduzieren will, benötigt diese Methode.
        //trimToSize()
        System.out.println("Kapazität : " + test.capacity());
        test.trimToSize();
        System.out.println("Kapazität: " + test.capacity());

    }


}
