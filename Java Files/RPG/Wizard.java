package rpg;

public class Wizard extends Character {

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

    public int castLightningBolt() {
        if (currentMagic >= 5) {
            currentMagic -= 5;

            return dice.roll() + this.intelligence;
        } else {
            return 0;
        }
    }

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

}
