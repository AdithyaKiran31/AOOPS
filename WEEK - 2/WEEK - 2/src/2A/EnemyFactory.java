package W2_2a;

public class EnemyFactory {
    public static Enemy createEnemy(String difficulty) {
        if (difficulty.equals("easy")) {
            return new EasyEnemy();
        } else if (difficulty.equals("hard")) {
            return new HardEnemy();
        } else {
            throw new RuntimeException("Invalid difficulty");
        }
    }
}
