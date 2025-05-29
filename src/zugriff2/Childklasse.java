package zugriff2;

import zugriff.Testklasse;

public class Childklasse extends Testklasse {

    public static void main(String[] args) {
        Childklasse test = new Childklasse();
        test.saitPublic();
        test.saitProtected();
        //test.saitDefault();
        //test.saitPrivate();
    }
}
