package homeWork;

public class Bottle extends ContainerWithCap {
    private int height;

    public Bottle(int size, String color, String capColor,int height) {
        super(size, color, capColor);
        this.height = height;
    }
}
