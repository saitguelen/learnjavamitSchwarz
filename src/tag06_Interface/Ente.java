package tag06_Interface;

public class Ente implements Fliegbar,Schwimmbar{

    @Override
    public  void fliegen(){
        System.out.println("Die Ente fliegt durch die Luft.");
    }
    @Override
    public void schwimmen(){
        System.out.println("Die Ente schwimmt auf dem Wasser.");
    }
}
