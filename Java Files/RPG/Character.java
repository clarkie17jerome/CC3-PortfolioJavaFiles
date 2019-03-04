package rpg;

public abstract class Character {

    static Dice dice = new Dice();
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxLife;
    protected int currentLife;
    protected int maxMagic;
    protected int currentMagic;

    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxLife = dice.roll() + 25;
        this.currentLife = maxLife;
    }

    public int attack() {
        return dice.roll() + strength;
    }

    public int dexterity() {
        return dice.roll() + dexterity;
    }

    public void wound(int damage) {
        currentLife -= damage;
    }

    public void heal(int heal) {
        if (currentLife < maxLife) {
            currentLife += heal;
        }
    }

    public int castLightningBolt() {
        if (currentMagic >= 5) {
            currentMagic -= 5;

            return dice.roll() + this.intelligence;
        } else {
            return 0;
        }
    }

    public int castHeal(int heal) {
        if (currentMagic >= 8) {
            currentMagic -= 8;

            heal(this.intelligence);
            return this.currentLife;
        } else {
            return this.currentLife;
        }
    }

    public int getMaxMagic() {
        return maxMagic;
    }

    public int getCurrentMagic() {
        return currentMagic;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int str) {
        this.strength = str;
    }

    public void setDexterity(int dex) {
        this.dexterity = dex;
    }

    public void setIntelligence(int intel) {
        this.intelligence = intel;
    }

    public void setCurrentLife(int life) {
        this.currentLife = life;
    }

    public void setMaxLife(int maxL) {
        this.maxLife = maxL;
    }

    public void setMaxMagic(int maxM) {
        this.maxMagic = maxM;
    }

    public void setCurrentMagic(int currentM) {
        this.currentMagic = currentM;
    }

}
