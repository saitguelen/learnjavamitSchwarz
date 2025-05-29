package tag08_Aufgabe_04_Schreiben;

class  Planet{}//Superklasse

class Erde extends Planet{//Kindsklasse
    void erdeBerichtet() {
        System.out.println("Ich bin der 3. Planet im Sonnensystem und ich kreise um die Sonne.");

    }


}

class Mars extends Planet{//Kindsklasse
    void marsBerichtet() {
        System.out.println("Ich bin der 4. Planet im Sonnensystem und ich kreise um die Sonne.");

    }

}


