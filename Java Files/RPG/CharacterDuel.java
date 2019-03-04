package rpg;

public class CharacterDuel extends Character {

    static Wizard Wizard = new Wizard("Wizard", 5, 5, 5) {};
    static Character Clark = new Character("Clark", 5, 5, 5) {};

    public static int damage;

    public CharacterDuel(String n, int s, int d, int i) {
        super(n, s, d, i);
        maxMagic = dice.roll() * super.intelligence;
        currentMagic = maxMagic;
    }

    public static void main(String[] args) {
        Display();
    }

    public static void Display() {
        //fight to death with subclasses and behaviors

        System.out.println("WIZARD VS. CLARK: \n" + "FIGHT TO DEATH: Who would win?\n" + "(Lightning bolts and self-heal can be seen!)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");

        Wizard.setCurrentLife(100);
        Clark.setCurrentLife(100);

        Wizard.setCurrentMagic(20);
        Clark.setCurrentMagic(20);

        for (int round = 1; Wizard.getCurrentLife() >= 0 && Clark.getCurrentLife() >= 0; round++) {
            System.out.println("Round " + round);
            System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife() + "\n");

            if (Wizard.getCurrentMagic() >= 8 && Wizard.getCurrentLife() < 50) {
                System.out.println(Wizard.getName() + " was healed for " + Wizard.castHeal(7));
            } else {
                if (Wizard.getCurrentMagic() >= 5) {
                    damage = Wizard.castLightningBolt();
                    System.out.println(Wizard.getName() + " threw a lightning bolt at " + Clark.getName() + " with damage of " + damage);
                } else {
                    damage = Wizard.attack();
                    System.out.println(Wizard.getName() + " attacks " + Clark.getName() + " with damage of " + damage);
                }

                Clark.wound(damage);

                if (Clark.getCurrentLife() <= 0) {
                    System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife());
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println(Wizard.getName() + " WINS!");
                    break;
                }
            }

            if (Clark.getCurrentMagic() >= 8 && Clark.getCurrentLife() < 50) {
                System.out.println(Clark.getName() + " was healed for " + Clark.castHeal(7));
            } else {
                if (Clark.getCurrentMagic() >= 5) {
                    damage = Clark.castLightningBolt();
                    System.out.println(Clark.getName() + " threw a lightning bolt at " + Wizard.getName() + " with damage of " + damage);
                } else {
                    damage = Clark.attack();
                    System.out.println(Clark.getName() + " attacks " + Wizard.getName() + " with damage of " + damage);
                }

                Wizard.wound(damage);

                if (Wizard.getCurrentLife() <= 0) {
                    System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife());
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println(Clark.getName() + " WINS!");
                    break;
                }
            }

            System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}