package W2_2a;

public class GameState {
    private static GameState instance;
    private int level;
    private String Difficulty;
    private GameState(){}
    static GameState getInstance(){
        if ( instance==null) {
            instance =new GameState();
            instance.level = 1;
            instance.Difficulty = "Easy";
        }
        return instance;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getDifficulty() {
        return Difficulty;
    }
    public void setDifficulty(String difficulty) {
        Difficulty = difficulty;
    }
}
    
    
