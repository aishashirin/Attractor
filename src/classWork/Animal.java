package classWork;

public abstract class Animal {
    int lifeExpectancy;
    float weight;
    boolean dead;
    abstract void makeSound();
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("" +
                "");
    }
}
