package homeWork._20_task_2;

public class ElectricScooter extends Scooter {
    private int batteryAmount;
    private int maxSpeed;

    public ElectricScooter(int wheelsAmount, String colorOfSteeringWheel, int platformLength, int platformsWidth,int batteryAmount,int maxSpeed) {
        super(wheelsAmount, colorOfSteeringWheel, platformLength, platformsWidth);
        this.batteryAmount = batteryAmount;
        this.maxSpeed = maxSpeed;
    }
}
