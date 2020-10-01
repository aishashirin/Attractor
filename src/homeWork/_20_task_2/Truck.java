package homeWork._20_task_2;

public class Truck extends Car{
    private int trailersAmount;
    private int maxWeight;

    public Truck(int wheelsAmount, String colorOfSteeringWheel, double enginePower, String color, String type, int doorsAmount,int trailersAmount,int maxWeight) {
        super(wheelsAmount, colorOfSteeringWheel, enginePower, color, type, doorsAmount);
        this.trailersAmount = trailersAmount;
        this.maxWeight = maxWeight;
    }
}
