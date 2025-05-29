package tag05_staticheMethode;

public class MatheTest {
    public static void main(String[] args) {

        double wert= Math.sin(Math.PI/2);  //also ohne Statiche Import Method
        System.out.println("Sinus von PI/2: "+wert);

        double max = maximum(10,20);// mit methode
        System.out.println("Maximum: "+max);

    }
    public static double maximum(double a, double b){
        return a>b ? a:b;
    }


}
