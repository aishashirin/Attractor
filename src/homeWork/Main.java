package homeWork;

import java.net.ContentHandler;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Container dish1 = new Pan(30,"black","black",false,2);
        ContainerWithCap dish2 = new Bottle(12,"white","yellow",10);
        Container dish3 = new Container(12,"green");
        Container dish4 = new Cup(15,"yellow",5);
        Container dish5 = new ContainerWithCap(13,"grey","blue");
        Container dish6 = new MilkPackage(10,"blue",99.0,45.5);

    }
}
