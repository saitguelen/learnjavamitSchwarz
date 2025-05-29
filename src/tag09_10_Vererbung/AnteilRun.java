package tag09_10_Vererbung;

public class AnteilRun {
    public static void main(String[] args) {
        Anteil a1 = new Anteil(1, 4);  // 0.25
        Anteil a2 = new Anteil(1, 2);  // 0.5
        Anteil a3 = new Anteil(1, 4);  // 0.25
       Anteil a4 = new Anteil(1, 10); // Fehler (weil 1.25 > 1.0)

///*
//        System.out.println("Verteilt (dezimal): " + a1.getVerteilt());
//        System.out.println("Verteilt (als Bruch): " + a1.getVerteiltAlsBruch().bruchToString());
//        System.out.println("Rest: " + a1.getRest().bruchToString());*/

       System.out.println("Verteilt (dezimal): " + a4.getVerteilt());
       System.out.println("Verteilt (als Bruch): " + a4.getVerteiltAlsBruch().bruchToString());
        System.out.println("Rest: " + a4.getRest().bruchToString());
    }
}