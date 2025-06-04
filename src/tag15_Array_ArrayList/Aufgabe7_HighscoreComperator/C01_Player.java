package tag15_Array_ArrayList.Aufgabe7_HighscoreComperator;

public class C01_Player {
    private String name;
    private int highscore;

    public C01_Player(String name, int highscore){
        this.name= name;
        this.highscore= highscore;
    }
    public String getName(){
        return name;
    }

    public int getHighscore() {
        return highscore;
    }

    @Override
    public String toString() {
        return "C01_Player{" +
                "name='" + name + '\'' +
                ", highscore=" + highscore +
                '}';
    }
}
