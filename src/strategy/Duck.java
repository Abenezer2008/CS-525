package strategy;

public abstract class Duck {
    Quackable quackable;
    Flyable flyable;
    void swim(){
        System.out.println("Duck Swimming.");
    }
    abstract void display();
}
