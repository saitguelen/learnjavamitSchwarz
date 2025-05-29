package tag11_Exception;

public class C07_ClassCastException {
    public static void main(String[] args) {
        Object obj = "Hallo Welt";

        try{
            Integer zahl = (Integer) obj;//<== Fehler tritt hier auf
        }catch (ClassCastException e){
            System.out.println("ClassCastException kommt es");
        }
    }
}
