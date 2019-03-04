package rpg;

public class TestCharacter {

    static Character Clark = new Character("Clark", 5, 5, 5) {};
    static Character Jerome = new Character("Jerome", 5, 5, 5) {};

    public static void main(String[] args) {
        Display();
    }

    public static void Display() {
        Clark.setCurrentLife(30);
        Jerome.setCurrentLife(30);

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
