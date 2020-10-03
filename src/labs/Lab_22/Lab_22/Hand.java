package Lab_22;

import java.util.Arrays;

public class Hand  {
    String[] hand = new String[5];

    public void giveCards(Deck deck){
        for (int i = 0; i<5;i++){
            hand[i] = deck.takeCard();
        }
    }

    public void printHand(){
        String indexes = "";
        String cards = "";
        for (int i=1;i<=5;i++){

            cards += hand[i-1] + " | " ;
            System.out.print(i + "  | ");
        }
        System.out.printf("%19s " , indexes);
        System.out.println();
        System.out.printf("%1s",cards);
        System.out.println();
    }

    public void cardReplacement(int i,Deck deck){
        hand[i -1] = deck.takeCard();
    }


}
