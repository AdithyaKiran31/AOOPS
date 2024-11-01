package W2_2a;

public class Game {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setLevel(1);
        gameState.setDifficulty("easy");

        Enemy enemy = EnemyFactory.createEnemy(gameState.getDifficulty());
        enemy.attack();

        Itemfactory itemFactory = Itemfactoryprovider.getFactory(gameState.getDifficulty());
        Items weapon = itemFactory.createWeapon();
        Items powerUp = itemFactory.createPowerUp();
        weapon.use();
        powerUp.use();
    }   
}
