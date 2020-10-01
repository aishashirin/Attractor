package homeWork._20_task_2;

public class Car extends Transport {
    private double enginePower;
    private String color;
    private String type;
    private int doorsAmount;

    public Car(int wheelsAmount, String colorOfSteeringWheel,double enginePower, String color, String type, int doorsAmount) {
        super(wheelsAmount, colorOfSteeringWheel);
        this.enginePower = enginePower;
        this.color = color;
        this.type = type;
        this.doorsAmount = doorsAmount;
    }
}
