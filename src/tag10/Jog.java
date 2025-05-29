package tag10;

public interface Jog {
    default void walk(){
        System.out.println("Walking and jogging");
    }
}
