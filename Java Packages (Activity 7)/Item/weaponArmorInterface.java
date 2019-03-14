package rpg;

import static rpg.Character.dice;

public abstract class weaponArmorInterface extends Character{

    public weaponArmorInterface(String n, int s, int d, int i) {
        super(n, s, d, i);
    }
    //Clark now uses armor
    public int useArmor(int heal) {
        if (currentMagic >= 8) {
            currentMagic -= 8;

            heal(currentLife += dice.roll() + strength);
            return this.currentLife;
        } else {
            return this.currentLife;
        }
    }

    //Clark now uses weapon
    public int useWeapon() {
        if (currentMagic >= 5) {
            currentMagic -= 5;
            return dice.roll() + strength;
        } else {
            return 0;
        }
    }
}
