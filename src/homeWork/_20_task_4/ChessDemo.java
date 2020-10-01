package homeWork._20_task_4;

import homeWork._20_task_3.Color;
import homeWork._20_task_3.Coordinates;
import homeWork._20_task_3.Figures;

public class ChessDemo {
    public static void main(String[] args) {
        ChessFigure king = new King( new Coordinates(1,1),Figures.K, Color.B);
        ChessFigure queen = new Queen(new Coordinates(5,3),Figures.Q,Color.W);
        ChessFigure pawn = new Pawn(new Coordinates(8,7),Figures.P,Color.W);

        System.out.println("first coordinates"+"\n");

        System.out.println(king.getCoordinates());
        System.out.println(queen.getCoordinates());
        System.out.println(pawn.getCoordinates());

        king.moveCoordinates();
        queen.moveCoordinates();
        pawn.moveCoordinates();
        System.out.println();

        System.out.println("figures names" + "\n");
        king.figure();
        queen.figure();
        pawn.figure();
        System.out.println();

        System.out.println("coordinates after moving"+"\n");
        System.out.println(king.getCoordinates());
        System.out.println(queen.getCoordinates());
        System.out.println(pawn.getCoordinates());

        king.moveCoordinates();
        queen.moveCoordinates();
        pawn.moveCoordinates();
        System.out.println();
        System.out.println("coordinates after moving"+"\n");
        System.out.println(king.getCoordinates());
        System.out.println(queen.getCoordinates());
        System.out.println(pawn.getCoordinates());

    }
}
