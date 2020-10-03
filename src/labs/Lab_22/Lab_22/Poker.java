//package Lab_22;
//
//import javax.swing.text.DefaultEditorKit;
//import java.util.Scanner;
//
//public class Poker {
//    public static void main(String[] args) {
//        Card card = new Card();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How many cards you want to take?");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (i == n - 1) {
//                System.out.println(card.printCard());
//            } else
//                System.out.print(card.printCard() + ", ");
//        }
//
//        Deck deck = new Deck();
//        System.out.println(deck);
//
//        deck.shuffle();
//        System.out.println(deck);
////
////        System.out.println(deck.takeCard());
////        System.out.println(deck);
////
////        deck.returnCard();
////        System.out.println(deck);
//
//        Hand hand = new Hand();
//        hand.giveCards();
//        System.out.println(hand);
//        System.out.println(deck);
//
//    }
//}
