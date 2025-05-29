package tag02_Uebungen;

public class Dolls {

    public static class Dollss {
        public boolean nested() { nested(2,true);
            return false;
        } // g1
        public int nested(int level, boolean height) { return nested(level); }
        public int nested(int level) { return level+1; }; // g2

    }

    public static void main(String[] outOfTheBox) {
        System.out.print(new Dollss().nested());
    }
}
