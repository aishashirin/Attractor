package homeWork._20_task_4;

import homeWork._20_task_3.Color;
import homeWork._20_task_3.Coordinates;
import homeWork._20_task_3.Figures;

public abstract class ChessFigure {
    private Coordinates coordinates;
    private Figures figures;
    private Color color;

    public ChessFigure(Coordinates coordinates, Figures figures, Color color) {
        this.coordinates = coordinates;
        this.figures = figures;
        this.color = color;
    }
    public abstract void figure();

    public Coordinates getCoordinates(){
        return coordinates;
    }
    public abstract void moveCoordinates();

    public Figures getFigures() {
        return figures;
    }

    public Color getColor() {
        return color;
    }

}
