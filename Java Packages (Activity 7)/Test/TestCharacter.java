package rpg;

public class TestCharacter {

    //attack was overriden because of abstract implementations
    static Character Clark = new Character("Clark", 5, 5, 5) {
        @Override
        public int attack() {
            return dice.roll() + strength;
        }
    };
    
    //attack was overriden because of abstract implementations
    static Character Jerome = new Character("Jerome", 5, 5, 5) {
        @Override
        public int attack() {
            return dice.roll() + strength;
        }
    };

    public static void main(String[] args) {
        Display();
        //to see characters fight to death
        //let the system do its job
    }

    public static void Display() {
        //set max health for both players
        Clark.setCurrentLife(30);
        Jerome.setCurrentLife(30);
        
        //with for loop, see the characters fight to death until one or both dies
        for (int i = 1; Clark.getCurrentLife() >= 0 && Jerome.getCurrentLife() >= 0; i++) {
            System.out.println("Round " + i);
            System.out.println(Clark.getName() + ": " + Clark.getCurrentLife() + "\n" + Jerome.getName() + ": " + Jerome.getCurrentLife());
            System.out.println(Clark.getName() + " attacks " + Jerome.getName() + " for " + Jerome.attack());
            System.out.println(Jerome.getName() + " attacks " + Clark.getName() + " for " + Clark.attack());
            Jerome.wound(Clark.attack());
            Clark.wound(Jerome.attack());
            System.out.println(Clark.getName() + ": " + Clark.getCurrentLife() + "\n" + Jerome.getName() + ": " + Jerome.getCurrentLife());

            if (Clark.getCurrentLife() <= 0 && Jerome.getCurrentLife() <= 0) {

                System.out.println("Draw.");
                break;
            } else if (Jerome.getCurrentLife() <= 0) {

                System.out.println("Clark WINS!");
            } else if (Clark.getCurrentLife() <= 0) {

                System.out.println("Jerome WINS!");
            }
        }
    }
}
