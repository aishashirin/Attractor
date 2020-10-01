package labs;

public class Hero {
  private int hp;
  private   int strength;
  private   int defence;
  private   int weapon;

    public int getDamage() {
        return damage;
    }

    private   int shield;
  private   int damage = 0;

    public Hero(int hp, int defence, int strength, int weapon, int shield) {
        this.hp = hp;
        this.strength = strength;
        this.defence = defence;
        this.weapon = weapon;
        this.shield = shield;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void hit (int dragonDefence){
        int d = strength + weapon - dragonDefence;
        setDamage(d);

    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getShield() {
        return shield;
    }
}
