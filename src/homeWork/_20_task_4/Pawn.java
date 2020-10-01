package homeWork._20_task_4;

import homeWork._20_task_3.Color;
import homeWork._20_task_3.Coordinates;
import homeWork._20_task_3.Figures;

public class Pawn extends ChessFigure{
    public Pawn(Coordinates coordinates, Figures figures, Color color) {
        super(coordinates, figures, color);
    }

    @Override
    public void figure() {
        System.out.println("Figures name: " + getFigures());
        System.out.println("Figures color: " + getColor());
    }

    @Override
    public void moveCoordinates() {
        getCoordinates().move();
    }
}
