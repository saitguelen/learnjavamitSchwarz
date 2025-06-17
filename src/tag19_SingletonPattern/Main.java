package tag19_SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Zentralbank zentralbank = Zentralbank.getInstance();
        System.out.println("Der aktuelle Leitzins liegt bei: " + zentralbank.getLeitzins() + " Prozent");
    }
}
