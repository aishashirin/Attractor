package homeWork._20_task_3;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        if (x >=1 && x<8 && y >=1 && y <8){
            x++;
        }
        else if (x == 8 && y < 8){
            y++;
        }
        else if (y == 8 && x < 8){
            x--;
        }
        else if (y ==8 && x == 8){
            x--;
        }
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
