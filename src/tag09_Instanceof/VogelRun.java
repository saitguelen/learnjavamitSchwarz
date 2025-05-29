package tag09_Instanceof;

public class VogelRun {
    public static void main(String[] args) {
        Adler horst = new Adler();
       // Adler horst2 = new Vogel();//Vogel' is abstract; cannot be instantiated
        System.out.println(horst instanceof Vogel);
        System.out.println(horst instanceof Adler);

    }
}
