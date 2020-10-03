package Lab_22;

import java.util.Arrays;
import java.util.Random;

public class Deck extends Card {
    private String[] deck = new String[52];
    private String card = "";

    public Deck(){
        int index = 0;
        for (int i = 0; i<13;i++){
            for (int j = 0; j <4; j++){
                this.deck[index] = getRole(i) + getSuit(j);
                index++;
            }
        }
    }

    public String takeCard(){
        card = deck[deck.length-1];
        String[] newDeck = new String[deck.length-1];
        for (int i = 0; i< newDeck.length; i++){
            newDeck[i] = deck[i];
        }
        deck = newDeck;
        return card;
    }
    public void returnCard(){
        String card = this.card;
        String [] newDeck = new String[deck.length+1];
        for (int i = 0 ;i< deck.length;i++){
            newDeck[i] = deck[i];
        }
        newDeck[newDeck.length-1] = card;
        deck = newDeck;
    }

    public void shuffle(){
        Random random = new Random();
        for (int i=0; i<52; i++){
            int r = random.nextInt(deck.length -1);
            swapCards(i,r);
        }
    }

    private void swapCards(int i,int j){
        String temp = "";
        temp = deck[i];
        deck[i] = deck[j];
        deck[j] = temp;
    }

    @Override
    public String toString() {
        return  Arrays.toString(deck) ;
    }
}
