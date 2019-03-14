package rpg;

public abstract class Wizard extends Character {

    protected int maxMagic;
    protected int currentMagic;

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        maxMagic = dice.roll() * super.intelligence;
        currentMagic = maxMagic;
    }

    //implementing attack() method in Wizard.java
    public int attack() {
        return dice.roll() + strength;
    }
    
    //uses lightning bolt but decreases "mana"
    public int castLightningBolt() {
        if (currentMagic >= 5) {
            currentMagic -= 5;

            return dice.roll() + this.intelligence;
        } else {
            return 0;
        }
    }

    //heals the player but reduces the mana
    public int castHeal() {
        if (currentMagic >= 8) {
            currentMagic -= 8;

            heal(this.intelligence);
            return this.currentLife;
        } else {
            return this.currentLife;
        }
    }

    public int getMaxMagic() {
        return this.maxMagic;
    }

    public int getCurrentMagic() {
        return this.currentMagic;
    }

    //Wizard now uses armor
    public int useArmor(int heal) {
        if (currentMagic >= 8) {
            currentMagic -= 8;
            
            heal(currentLife += dice.roll() + strength);
            return this.currentLife;
        } else {
            return this.currentLife;
        }
    }

    //Wizard now uses weapon
    public int useWeapon() {
        if (currentMagic >= 5) {
            currentMagic -= 5;
            return dice.roll() + strength;
        } else {
            return 0;
        }
    }
}
