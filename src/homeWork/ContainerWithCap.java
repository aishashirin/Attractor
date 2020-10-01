package homeWork;

public class ContainerWithCap extends Container{
    private String capColor;

    public ContainerWithCap(int size, String color,String capColor) {
        super(size, color);
        this.capColor = capColor;
    }
}
