package tag14_StringBuilder;

public class test {

    public static void main(String[] args) {
         String s = "Hallo";
        System.out.println(s.indexOf("l",3));//3
        String s2 ="ABC";
        s2.toLowerCase();
        System.out.println(s2);//ABC
        System.out.println(s2.toLowerCase());//abc
        String a ="Java";
        String b= "Ja"+"va";
        System.out.println(a==b);//true
        String a1="";
        //System.out.println(a1.charAt(0));//StringIndexOutOfBoundsException
        //System.out.println(a1.substring(1));//StringIndexOutOfBoundsException
        System.out.println(a1.length());//0
        //System.out.println(a1.substring(0,1));//StringIndexOutOfBoundsException
        System.out.println(s.substring(0,s.length()));//Hallo

        String str1="abc";
        String str2=str1;
         str1="def";
        System.out.println(str2);//abc
        System.out.println(str1);//def

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;sb1.append("d");
        System.out.println(sb2.toString());

        String s3 = "  abc  ";
        System.out.println(s3.trim().replace(" ", "_"));

        StringBuilder sb = new StringBuilder("12345");
        sb.replace(1, 4, "X");
        System.out.println(sb);

        StringBuilder sbr1 = new StringBuilder("abc");
        StringBuilder sbr2 = sbr1;
        sbr1.append("d");
        System.out.println(sbr2.toString());//abcd






    }
}
