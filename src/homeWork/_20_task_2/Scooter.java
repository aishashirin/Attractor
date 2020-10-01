package homeWork._20_task_2;

public class Scooter extends Transport {
    private int platformsWidth;
    private int platformLength;

    public Scooter(int wheelsAmount, String colorOfSteeringWheel,int platformLength,int platformsWidth) {
        super(wheelsAmount, colorOfSteeringWheel);
        this.platformLength = platformLength;
        this.platformsWidth = platformsWidth;
    }
}
