package homeWork._20_task_2;

public class Bus extends Car{
    private int passengerSeats;
    private boolean handrails;
    private boolean haveSecondFloor;

    public Bus(int wheelsAmount, String colorOfSteeringWheel, double enginePower, String color, String type, int doorsAmount,int passengerSeats,boolean handrails,boolean haveSecondFloor) {
        super(wheelsAmount, colorOfSteeringWheel, enginePower, color, type, doorsAmount);
        this.passengerSeats = passengerSeats;
        this.handrails = handrails;
        this.haveSecondFloor = haveSecondFloor;
    }
}
