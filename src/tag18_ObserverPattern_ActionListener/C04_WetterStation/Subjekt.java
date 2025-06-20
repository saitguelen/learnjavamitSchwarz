package tag18_ObserverPattern_ActionListener.C04_WetterStation;

public interface Subjekt {
    void registriereBeobachter(Beobachter b);
    void entferneBeobachter(Beobachter b);
    void benachrichtigeAlleBeobachter();

}
