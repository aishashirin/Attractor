package homeWork;

public class Pan extends ContainerWithCap {
    private boolean haveHandle;
    private int amountOfHandle;
    public Pan(int size, String color, String capColor,boolean haveHandle,int amountOfHandle) {
        super(size, color, capColor);
        this.haveHandle = haveHandle;
        this.amountOfHandle = amountOfHandle;
    }

    public Pan(int size, String color, String capColor,boolean haveHandle) {
        super(size, color, capColor);
        this.haveHandle = haveHandle;
    }
}
