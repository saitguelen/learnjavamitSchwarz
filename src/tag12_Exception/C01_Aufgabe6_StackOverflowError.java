package tag12_Exception;

public class C01_Aufgabe6_StackOverflowError {

    public static int summe(final int n){
        if( n<=0)
            throw new IllegalArgumentException("n muss >=1 sein");

        //rekursiver Abbruch
        if (n == 1)
            return 1;

        return n + summe(n-1);
    }

    public static void main(String[] args) {
        System.out.println(summe(100));
        //System.out.println(summe(100000));

        /*Ein StackOverflowError entsteht, wenn eine Methode zu oft rekursiv aufgerufen wird,
        sodass der Speicherbereich für Methodenaufrufe (Call-Stack) überläuft.
        Jeder rekursive Aufruf braucht einen kleinen Speicherplatz.
        Bei sehr hohen n-Werten (z.B. 10000 oder 20000) wird der Speicher voll und
        Java wirft diesen Fehler.*/

        /*Bei Schleifen (for, while) passiert alles in einem einzigen Methodenaufruf.
        Es gibt keine neuen Stack-Frames für jede Iteration. Deshalb tritt der Fehler nicht auf.*/
    }
}
