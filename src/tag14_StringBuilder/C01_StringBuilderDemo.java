package tag14_StringBuilder;

public class C01_StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();//wie bei der ArrayList können wir in runden Klammern die Kapazität angeben.
        System.out.println(name.capacity());//Der StringBuilder hat per default Platz für 16 Zeichen.

        String test = " ";//Leerer Sting
        //StringBuilder x = " "; Beim StringBuilder können wir NICHT den Zuweisungsoperator verwenden.
        //Wir können aus einem String einen StringBuilder machen

        String dorf = "Das Dorf ";
        StringBuilder x = new StringBuilder(dorf);
        x.append("ist mein Dorf");
        System.out.println(x);
        //Der + Operator funktioniert beim StringBuilder nicht, zumindest wenn es ums Konkatenieren geht.
        StringBuilder palindrom = new StringBuilder("Informatik");
        System.out.println(palindrom.reverse());
        //Für toUpperCase() oder toLowerCase() muss der StringBuilder wieder in einen String umgewandelt werden
        //Hierfür gibt es die bekannte toString()-Methode.
        String y = palindrom.toString().toUpperCase();
        System.out.println(y);

        //Gleichheit
        StringBuilder a = new StringBuilder("12a");
        StringBuilder b = new StringBuilder("12a");

        System.out.println(a.toString().equals(b.toString()));//equals liefert den inhaltlichen Vergleich

    }
}



