package labs;

public class Enemy {
   private int hp;
   private int strength;
   private int defence;
   private int weapon;
   private int damage = 0;


    public Enemy(int hp, int defence, int strength, int weapon) {
        this.hp = hp;
        this.strength = strength;
        this.defence = defence;
        this.weapon = weapon; }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void hit(int heroDefence){
        int d = weapon + defence - heroDefence;
        setDamage(d);
    }

    public int getWeapon() {
        return weapon;
    }

}
