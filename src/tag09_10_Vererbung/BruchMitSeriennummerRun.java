package tag09_10_Vererbung;

public class BruchMitSeriennummerRun {
    public static void main(String[] args) {
        BruchMitSeriennummer b1 = new BruchMitSeriennummer(1, 2);
        BruchMitSeriennummer b2 = new BruchMitSeriennummer(1, 3);
        BruchMitSeriennummer b3 = new BruchMitSeriennummer(2, 5);
        BruchMitSeriennummer b4 = new BruchMitSeriennummer(3, 4);
        BruchMitSeriennummer b5 = new BruchMitSeriennummer(5, 8);

        System.out.println("Bruch: " + b1.bruchToString() + "\nSeriennummer: " + b1.getSeriennummer());
        System.out.println("Bruch: " + b2.bruchToString() + "\nSeriennummer: " + b2.getSeriennummer());
        System.out.println("Bruch: " + b3.bruchToString() + "\nSeriennummer: " + b3.getSeriennummer());
        System.out.println("Bruch: " + b4.bruchToString() + "\nSeriennummer: " + b4.getSeriennummer());
        System.out.println("Bruch: " + b5.bruchToString() + "\nSeriennummer: " + b5.getSeriennummer());
    }
}