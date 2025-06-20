package tag01_Constructor;

public class test2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {
            boolean p = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0 ){
                    p = false;
                    System.out.println(i + " ist keine Primzahl");
                    break;
                } else {

                }
            }
            if(p){
            System.out.println(i + " ist eine Primzahl.");}


        }
    }
}


