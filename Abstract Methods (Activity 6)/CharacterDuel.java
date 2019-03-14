package rpg;

public abstract class CharacterDuel extends Character {

    static Wizard Wizard = new Wizard("Wizard", 5, 5, 5) {
    };

    //attack was overriden because of abstract implementations
    static Character Clark = new Character("Clark", 5, 5, 5) {
        @Override
        public int attack() {
            return dice.roll() + strength;
        }
    };

    public static int damage;

    public CharacterDuel(String n, int s, int d, int i) {
        super(n, s, d, i); //calling the super class
        maxMagic = dice.roll() * super.intelligence;
        currentMagic = maxMagic;
    }

    public static void main(String[] args) {
        Display();
        //just tosee them fight til death
    }

    public static void Display() {
        //fight to death with subclasses and behaviors

        System.out.println("WIZARD (w/ ENERGY BLAST) VERSUS \nCLARK (w/ TAMAHAGANE KATANA): \n" + "FIGHT TO DEATH: Who would win?");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");

        //max health for each
        Wizard.setCurrentLife(110);
        Clark.setCurrentLife(110);

        //max magic for each
        Wizard.setCurrentMagic(45);
        Clark.setCurrentMagic(45);

        //Wizard
        //let the system do its job
        //he either uses armor, weapon, energy blast or just simply attack
        for (int round = 1; Wizard.getCurrentLife() >= 0 && Clark.getCurrentLife() >= 0; round++) {
            System.out.println("Round " + round + " FIGHT!");
            System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife() + "\n");

            if (Wizard.getCurrentMagic() >= 10 && Wizard.getCurrentLife() < 50) {
                System.out.println(Wizard.getName() + " used ARMOR for " + Wizard.useArmor(0) + " points.");
            } else if (Wizard.getCurrentMagic() >= 5) {
                damage = Wizard.useWeapon();
                System.out.println(Wizard.getName() + " uses ENERGY BLAST at " + Clark.getName() + " with damage of " + damage + ".");
            } else {
                damage = Wizard.attack();
                System.out.println(Wizard.getName() + " attacks " + Clark.getName() + " with damage of " + damage + ".");
            }

            Clark.wound(damage);

            //Clark
            //let the system do its job
            //he either uses armor, weapon, energy blast or just simply attack
            if (Clark.getCurrentMagic() >= 10 && Clark.getCurrentLife() < 50) {
                System.out.println(Clark.getName() + " used ARMOR for " + Clark.useArmor(0) + " points.");
            } else if (Clark.getCurrentMagic() >= 5) {
                damage = Clark.useWeapon();
                System.out.println(Clark.getName() + " uses TAMAHAGANE KATANA at " + Wizard.getName() + " with damage of " + damage + ".");
            } else {
                damage = Clark.attack();
                System.out.println(Clark.getName() + " attacks " + Wizard.getName() + " with damage of " + damage + ".");
            }

            Wizard.wound(damage);

            //the system checks their hit points (HP)
            System.out.println();
            if (Wizard.getCurrentLife() <= 0 && Clark.getCurrentLife() >= 1) {
                System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife());
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println(Clark.getName() + " WINS!");
            } else if (Clark.getCurrentLife() <= 0 && Wizard.getCurrentLife() >= 1) {
                System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife());
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println(Wizard.getName() + " WINS!");
            } else if (Wizard.getCurrentLife() <= 0 && Clark.getCurrentLife() <= 0) {
                System.out.println("IT'S A DRAW.");
            }

            System.out.println(Wizard.getName() + ": " + Wizard.getCurrentLife() + "\n" + Clark.getName() + ": " + Clark.getCurrentLife());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}
