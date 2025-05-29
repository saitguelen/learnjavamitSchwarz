package tag12_Exception;

public class C01_Aufgabe6_StackOverflowErrormitSchleife {
    public static int summeMitSchleife(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n muss >=1 sein");
        }

        int summe = 0;
        for (int i = 1; i <= n; i++) {
            summe += i;
        }
        return summe;
    }

    public static void main(String[] args) {
        //System.out.println(summeMitSchleife(-10));

        System.out.println(summeMitSchleife(100000));

        /*StackOverflowError, bir metodun çok fazla kez kendini çağırmasıyla oluşur.
        Java’daki her metod çağrısı bellekte bir yer kaplar (call-stack).
        Çok derin rekürsiyonlarda bu bellek dolduğu için Java bu hatayı fırlatır.
        Örneğin summe(20000) çağrısı, belleği taşır çünkü 20000 kez metodun içine girip çıkmak zorunda kalır*/

        /*
        Döngülerde her seferinde yeni bir metod çağrısı yapılmaz.
        Tüm işlem aynı metot bloğu içinde gerçekleştiği için bellekte yeni yer açılmaz.
        Bu yüzden StackOverflowError oluşmaz.*/

    }
}
