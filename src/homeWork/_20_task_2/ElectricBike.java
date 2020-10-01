package homeWork._20_task_2;

public class ElectricBike extends Bicycle{
    private int amountBattery;
    private int maxSpeed;
    
    public ElectricBike(int wheelsAmount, String colorOfSteeringWheel, int amountOfPedals, int chainLength, boolean backSeat,int amountBattery,int maxSpeed) {
        super(wheelsAmount, colorOfSteeringWheel, amountOfPedals, chainLength, backSeat);
        this.amountBattery = amountBattery;
        this.maxSpeed = maxSpeed;
    }
}
