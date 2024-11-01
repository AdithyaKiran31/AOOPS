package W2_2a;

public class Itemfactoryprovider {
    public static Itemfactory getFactory(String difficulty) {
        if (difficulty.equals("easy")) {
            return new preset1();
        }  else if (difficulty.equals("hard")) {
            return new preset2();
        } else {
            throw new IllegalArgumentException("Invalid difficulty level");
        }
    
    }
}
