package homeWork._20_task_2;

public class Bicycle extends Transport {
    private int amountOfPedals;
    private int chainLength;
    private boolean backSeat;

    public Bicycle(int wheelsAmount, String colorOfSteeringWheel,int amountOfPedals,int chainLength,boolean backSeat) {
        super(wheelsAmount, colorOfSteeringWheel);
        this.amountOfPedals = amountOfPedals;
        this.chainLength = chainLength;
        this.chainLength = chainLength;
        this.backSeat = backSeat;
    }
}
