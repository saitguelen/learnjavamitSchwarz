package tag07_Mitarbeiter;
public class Main {
public static void main(String[] args) {
    // ScrumMaster testen
    ScrumMaster scrumMaster = new ScrumMaster(
            "SM001", "Murat G.", "Scrum Master", 5,
            "Entwicklung", 5500.0, 5
    );

    System.out.println("=== ScrumMaster ===");
    scrumMaster.zeigeMitarbeiterInfo();

    double bonus = scrumMaster.berechneBonus(0.1);
    double bonusMitZulage = scrumMaster.berechneBonus(0.1, 500);

    System.out.println("Bonus (10%): " + bonus + " EUR");
    System.out.println("Bonus mit Sonderzulage: " + bonusMitZulage + " EUR");

    System.out.println("\n=== Freelancer ===");

    // Freelancer testen
    Freelancer freelancer = new Freelancer(
            "FR001", "Nesibe T.", "UX Designer", 3,
            "IT-Sicherheit", 40.0, 120
    );

    freelancer.zeigeMitarbeiterInfo();
}
}