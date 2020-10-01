package homeWork._20_task_3;

public class King {
    private Coordinates coordinates;
    private Figures figures;
    private Color color;

    public void figure(){
        System.out.println("Figures name: " + figures);
        System.out.println("Figures color: " + color);
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }
    public void moveCoordinates(){
        coordinates.move();
    }
}




