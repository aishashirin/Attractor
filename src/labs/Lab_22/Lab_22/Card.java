package Lab_22;

import java.util.Collection;
import java.util.Random;

public class Card {
    private String[] role = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String[] suit = {"\u2660","\u2665","\u2666","\u2663"};

    public String getRole(int i) {
        return role[i];
    }

    public String getSuit(int j) {
        return suit[j];
    }

    public String printCard(){
        Random random = new Random();
        String card = "";
        int a = random.nextInt(13);
        int b = random.nextInt(3);
        switch (a) {
            case 0 -> card = role[0];
            case 1 -> card = role[1];
            case 2 -> card = role[2];
            case 3 -> card = role[3];
            case 4 -> card = role[4];
            case 5 -> card = role[5];
            case 6 -> card = role[6];
            case 7 -> card = role[7];
            case 8 -> card = role[8];
            case 9 -> card = role[9];
            case 10 -> card = role[10];
            case 11 -> card = role[11];
            case 12 -> card = role[12];
            case 13 -> card = role[13];
        }
        switch (b){
            case 0 -> card += " " + suit[0];
            case 1 -> card += " " + suit[1];
            case 2 -> card += " " + suit[2];
            case 3 -> card += " " + suit[3];
            case 4 -> card += " " + suit[4];
        }
        return card;
    }
//    public void printCard(int n){
//        Random random = new Random();
//        for (int i = 0; i < n; i++){
//            int a = random.nextInt(13);
//            int b = random.nextInt(4);
//            System.out.println(role[a]+suit[b]);
//        }
//    }
}
