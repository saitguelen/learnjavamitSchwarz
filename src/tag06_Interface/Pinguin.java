package tag06_Interface;

public class Pinguin  implements Schwimmbar{

    @Override
    public void schwimmen(){
        System.out.println("Der Pinguin schwimmt sehr schnell.");
    }
}
