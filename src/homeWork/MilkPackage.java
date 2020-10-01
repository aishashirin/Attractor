package homeWork;

public class MilkPackage extends Container {
    private double volume;
    private double price;

    public MilkPackage(int size, String color,double volume,double price) {
        super(size, color);
        this.volume = volume;
        this.price = price;

    }
}
