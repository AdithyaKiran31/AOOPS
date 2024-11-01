package W2_2a;

public class preset2 extends Itemfactory {
    @Override
    public Items createWeapon() {
        return new Magic();
    }

    @Override
    public Items createPowerUp() {
        return new medikit();
    }
}
