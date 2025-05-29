package tag06_Interface;

public class TierVerhaltenRun {
    public static void main(String[] args) {
        Fliegbar f1 = new Ente();
        f1.fliegen();

        Schwimmbar s1 = new Ente();
        s1.schwimmen();

        Schwimmbar s2 = new Pinguin();
        s2.schwimmen();
    }
}
