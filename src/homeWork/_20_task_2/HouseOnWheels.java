package homeWork._20_task_2;

public class HouseOnWheels extends Car{
    private boolean toilet;
    private boolean kitchen;
    private int amountOfBeds;
    public HouseOnWheels(int wheelsAmount, String colorOfSteeringWheel, double enginePower, String color, String type, int doorsAmount,
                         boolean toilet,boolean kitchen,int amountOfBeds) {
        super(wheelsAmount, colorOfSteeringWheel, enginePower, color, type, doorsAmount);
        this.toilet = toilet;
        this.amountOfBeds = amountOfBeds;
        this.kitchen = kitchen;
    }
}
