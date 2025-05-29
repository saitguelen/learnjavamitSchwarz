package tag04_Vererbung_Lampe;

public class Main {
    public static void main(String[] args) {

        //in der main method Erstellen wir zwei objekt
        Gluehlampe gl = new Gluehlampe(60);
        LEDLampe led = new LEDLampe(9);

        int stundenProTag = 10;//Dann rufen wir toString(10) auf, um die Ausgaben für 10 Stunden tägliche Nutzung zu zeigen.

        System.out.println(gl.toString(stundenProTag));
        System.out.println(led.toString(stundenProTag));

    }
}
