package homeWork._20_task_2;

public class quadBike extends Transport {
    private int maxSpeed;
    private String color;
    public quadBike(int wheelsAmount, String colorOfSteeringWheel,int maxSpeed,String color) {
        super(wheelsAmount, colorOfSteeringWheel);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }
}
