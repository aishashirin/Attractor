package labs;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        Hero hero = new Hero(1000,100,120,250,150);
        Enemy dragon = new Enemy(2000,120,150,0);
        Enemy hellHound = new Enemy(1800,150,120,50);

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = rand.nextInt(2)+1;
        if (n == 1){
        while (dragon.getHp() != 0 && hero.getHp() != 0){

            game.heroHit(scanner,rand,hero,dragon);
            game.dragonHit(scanner,rand,hero,dragon);
        }
        System.out.println("Game over!");
        if (dragon.getHp() == 0){
        System.out.println("Hero Wins!");}
        else
            System.out.println("Dragon wins!");
    }
        else{
            while (hellHound.getHp() != 0 && hero.getHp() != 0){

                game.heroHit(scanner,rand,hero,hellHound);
                game.hellHoundHit(scanner,rand,hero,hellHound);
            }
            System.out.println("Game over!");
            if (hellHound.getHp() == 0){
                System.out.println("Hero Wins!");}
            else
                System.out.println("Hell Hound wins!");
        }
    }

    public void heroHit(Scanner scanner, Random rand, Hero hero, Enemy enemy){
        System.out.println("press 1 to hit or 2 for defence!");
        int hit = scanner.nextInt();
        if (hit == 1) {
            int n = rand.nextInt(4) + 1;
            if (n != 4){
                //hero.setDefence(hero.getDefence() - hero.getShield());
                System.out.println("=================================");
                System.out.println("Hero made hit!");
                hero.hit(enemy.getDefence());
                enemy.setHp(hero.getDamage() - Math.abs(enemy.getHp()));
                System.out.println("Your Damage: " + hero.getDamage() + ". Enemy's HP: " + Math.abs(enemy.getHp()));
                System.out.println("=================================");

            }
            else{
                //hero.setDefence(hero.getDefence() );
                System.out.println("=================================");
                System.out.println("Hero couldn't hit the Dragon! Try again");
                hero.setDamage(0);
                System.out.println("Your Damage: " + hero.getDamage() + ". Enemy's HP: " + Math.abs(enemy.getHp()));
                System.out.println("=================================");

            }
        }
        else if (hit == 2){
            System.out.println("=================================");
            System.out.println("Hero choose defence!");
            hero.setDefence(hero.getDefence() + hero.getShield());
            System.out.println("=================================");
        }
        else
            System.out.println("enter only 1 or 2");
    }

    public void dragonHit(Scanner scanner, Random rand, Hero hero, Enemy dragon){
        int n = rand.nextInt(2)+1;
        if (n!=2){
            System.out.println("=================================");
            System.out.println("Dragon made hit!");
            dragon.hit(hero.getDefence());
            hero.setHp(dragon.getDamage() - Math.abs(hero.getHp()));
            System.out.println("Dragon's damage: " + dragon.getDamage() + ".Hero's HP: " + Math.abs(hero.getHp()));
            System.out.println("=================================");
        }

        else{
            System.out.println("=================================");
            System.out.println("Dragon couldn't hit the hero! Try again");
            dragon.setDamage(0);
            System.out.println("Dragon's Damage: " + dragon.getDamage() + ". Hero 's HP: " + Math.abs(hero.getHp()));
            System.out.println("=================================");
        }
    }

    public void hellHoundHit(Scanner scanner,Random rand,Hero hero,Enemy hellHound){
        System.out.println("=================================");
        System.out.println("Hell Hound made hit!");
        hellHound.hit(hero.getDefence());
        hero.setHp((hellHound.getDamage() + hellHound.getWeapon()) - Math.abs(hero.getHp()));
        System.out.println("Hell Hound's damage: " + hellHound.getDamage() + ".Hero's HP: " + Math.abs(hero.getHp()));
        System.out.println("=================================");
    }

}
