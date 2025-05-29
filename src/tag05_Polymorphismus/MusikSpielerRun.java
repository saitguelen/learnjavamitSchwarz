package tag05_Polymorphismus;

public class MusikSpielerRun {
    public static void main(String[] args) {
        MusikSpieler [ ] instrumente = {
                new Gitarre(),
                new Klavier(),
                new Schlagzeug()
        };

        for(MusikSpieler i: instrumente){
            i.spielen();
        }
    }
}
