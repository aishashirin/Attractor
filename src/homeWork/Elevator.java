package homeWork;

import java.util.Random;
import java.util.stream.LongStream;

public class Elevator {
    int currentFloor;
    int capacity;
    int maxFloor = 18;
    Random random = new Random();

    Elevator(int currentFloor){
        this.currentFloor = currentFloor;
    }

    public void move(int toFloor){
        if (toFloor > currentFloor){
        for (int i = currentFloor; i<=toFloor ; i++){
            System.out.println("you are now on " + i + " floor");
            if (i == toFloor){
                System.out.println("you are at your floor!");
            }
        }
        currentFloor = toFloor;}
        else if (toFloor <currentFloor){
            for (int i = currentFloor; i>=toFloor ; i--){
                System.out.println("you are now on " + i + " floor");
                if (i == toFloor){
                    System.out.println("you are at your floor!");
                }
            }
            currentFloor = toFloor;
        }
        else if (toFloor == currentFloor){
            System.out.println("you are at your floor!");
        }
    }

    public boolean isAllowableWeight(int weight){
        if (weight > 0 && weight <=200){
            return true;
        }
        else
            return false;
    }

    public boolean isAllowableFloor(int floor){
        if (floor>0 && floor <= maxFloor){
            return true;
        }
        else
            return false;
    }

    public boolean bonus() {

        int n = random.nextInt(3) + 1;
        System.out.println(n);

        if (n == 3) {
            return true;
        }
        else
            return false;
    }

    public void stuck(int toFloor){
        int i = random.nextInt(currentFloor) + toFloor;
        currentFloor = i;
        System.out.println("you stuck on " + i + " floor.");
    }
}
