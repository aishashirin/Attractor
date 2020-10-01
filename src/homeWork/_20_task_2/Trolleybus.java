package homeWork._20_task_2;

public class Trolleybus extends Bus{
    private int lengthOfElectricDrive;

    public Trolleybus(int wheelsAmount, String colorOfSteeringWheel, double enginePower, String color, String type, int doorsAmount, int passengerSeats,
                      boolean handrails, boolean haveSecondFloor,int lengthOfElectricDrive) {
        super(wheelsAmount, colorOfSteeringWheel, enginePower, color, type, doorsAmount, passengerSeats, handrails, haveSecondFloor);
        this.lengthOfElectricDrive = lengthOfElectricDrive;
    }
}
