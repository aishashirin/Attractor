package homeWork._21_task;

public class Salt extends Product {
    public Salt(String name, int expirationDate, boolean inFridge) {
        super(name, expirationDate, inFridge);
    }

    @Override
    public boolean fresh(boolean inFridge) {
        return true;
    }
}
