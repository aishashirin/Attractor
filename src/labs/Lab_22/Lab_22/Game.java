package Lab_22;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Hand hand = new Hand();
        deck.shuffle();

        System.out.println("Cards in your hand:");
        hand.giveCards(deck);
        hand.printHand();

        System.out.println("You want remove your cards? \n 1-yes \n 2-no");
        int intForRemove = scanner.nextInt();
        switch (intForRemove){
            case 1:
                System.out.println("How many cards you want remove? ");
                int num = scanner.nextInt();
                System.out.println("Enter number of cards which you want remove: ");
                for (int i = 0; i < num; i++){
                    int index = scanner.nextInt();
                    hand.cardReplacement(index,deck);
                }
                System.out.println("Cards in your hand:");
                hand.printHand();
                break;
            case 2:
                System.out.println("Your hand doesn't changed!");
                hand.printHand();
                break;
            default:
                System.out.println("enter only 1 or 2!");

        }
    }
}
