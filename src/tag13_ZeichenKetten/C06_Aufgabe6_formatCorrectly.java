package tag13_ZeichenKetten;

public class C06_Aufgabe6_formatCorrectly {
    /*Write and run a Java program that capitalizes a two-word name. For example, the input
noRth CARoliNa
would produce the output
North Carolina*/

    public static void main(String[] args) {
        String s = "noRth CARoliNa";

        String [] teile = s.split(" ");
        String wort1 = teile[0].substring(0,1).toUpperCase()+teile[0].substring(1).toLowerCase();
        String wort2 = teile[1].substring(0,1).toUpperCase()+teile[1].substring(1).toLowerCase();

        System.out.println(wort1+" "+wort2);
    }
}
