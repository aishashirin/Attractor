package homeWork;

public class Lamp {
    private  int brightness = 100;
    private boolean turnedOn = false;
    private int minBrightness = 10;
    private int maxBrightness = 100;
    private String color;

    Lamp(int minBrightness, int maxBrightness, String color) {
        this.minBrightness = minBrightness;
        this.maxBrightness = maxBrightness;
        this.color = color;
    }

    Lamp(int minBrightness, int maxBrightness){
        this.minBrightness = minBrightness;
        this.maxBrightness = maxBrightness;
    }

    Lamp(String color){
        this.color = color;
   }



    void toogle() {
        turnedOn = !turnedOn;
    }
    void makeBrightness(){
        brightness = Math.min(100,brightness+10);
    }
    void makeDimmer(){
        brightness = Math.max(10,brightness-10);
    }
    void print(){
        String fmt = "Brightness: %s\nMax brightness: %s\nMin brightness: %s";
        System.out.println(String.format(fmt,brightness,maxBrightness,minBrightness));
    }
}
