package tag14_StringBuilder;

public class C05_VergleichStringundStringBuilder {
    public static void main(String[] args) {
        //---------------String----------
        System.out.println("//---------------String----------");

        long start1= System.currentTimeMillis();

        String str = "";
        for(int i =0; i<10000; i++){
            str +="a";
        }

        long ende1 = System.currentTimeMillis();
        System.out.println("String dauert: "+(ende1-start1)+" ms");//String dauert: 58 ms

        //-------------StringBuilder--------------
        System.out.println("//-------------StringBuilder--------------");

        long start2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<10000;i++){
            sb.append("a");
        }

        long ende2= System.currentTimeMillis();
        System.out.println("String Builder Dauert: "+ (ende2-start2)+" ms"); //String Builder Dauert: 2 ms

    }
}
