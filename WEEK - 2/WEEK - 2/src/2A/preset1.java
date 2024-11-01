package W2_2a;

public class preset1 extends Itemfactory {
    @Override
    public Items createWeapon() {
        return new melee();
    }

    @Override
    public Items createPowerUp() {
        return new medikit();
    }
    
}
