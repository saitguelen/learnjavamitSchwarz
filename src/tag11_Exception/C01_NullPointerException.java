package tag11_Exception;

public class C01_NullPointerException {


    public static String ersteZuUpperCase(String[] array) {
        return array[0].toUpperCase();
    }

    public static void main(String[] args) {
        String[] array = new String[5];//null-Werte
        //array[0] = "Johnny";//<= Fehler tritt hier auf!
        try {
            String element = ersteZuUpperCase(array);
            System.out.println("Element: " + element);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException!");
        }


    }

}


