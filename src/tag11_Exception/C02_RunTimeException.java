package tag11_Exception;

public class C02_RunTimeException {


    public static void main(String[] args) {
        String str = " ";//leerer String

        try {
            int a = 10 / 0; //Division durch Null --> try-Block wird abgebrochen
            str += "a";
        } catch (RuntimeException e) {
            str += "b";
        }
        //finally wird ausgeführt egal ob Fehler passiert ist oder nicht
        finally {
            str += "c";
        }

        str += "d";

        System.out.println("Der String lautet: " + str);//1. FAll acd 2. Fall bcd

    }
}


