package strategy;

public class MallardDuck extends Duck{
    MallardDuck(){
        flyable = new FlyWithWings();
        quackable = new Quack();
    }
    @Override
    void display() {
        System.out.println("Display Mallard.");
    }
}
