package zugriff;

public class Testklasse {

    public void saitPublic(){
        System.out.println("Das ist public Zugriff modifier!!");
    }
    protected void saitProtected(){
        System.out.println("Das ist protected Zugriff modifier!!");
    }
    void saitDefault(){
        System.out.println("Das ist default oder package-private Zugriff modifier!!");
    }
    private void saitPrivate(){
        System.out.println("Das ist private Zugriff modifier!!");
    }



    public static void main(String[] args) {



        Testklasse test = new Testklasse();
        test.saitPublic();
        test.saitProtected();
        test.saitDefault();
        test.saitPrivate();
    }
}
