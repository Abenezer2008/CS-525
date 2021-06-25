package strategy;

public class RubberDuck extends Duck{
    RubberDuck(){
        quackable = new Squeak();
        flyable = new FlyNoWay();
    }
    @Override
    void display() {
        System.out.println("Display Rubber.");
    }
}
