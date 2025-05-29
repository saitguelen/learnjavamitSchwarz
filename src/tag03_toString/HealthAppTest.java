package tag03_toString;

public class HealthAppTest {
    public static void main(String[] args) {
        Schrittzaehler tom = new Schrittzaehler("11.12.2022");
        Schrittzaehler susi = new Schrittzaehler("13.03.2023");

        for (int i = 0; i < 1111; i++) {
            tom.erhoeheAnzahlSchritte();
        }

        for (int i = 0; i < 10_000; i++) {
            susi.erhoeheAnzahlSchritte();
        }

        System.out.println(tom);
        System.out.println(susi);
    }
}


