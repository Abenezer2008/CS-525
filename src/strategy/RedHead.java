package strategy;

public class RedHead extends Duck{
    RedHead(){
        quackable = new Quack();
        flyable = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Display RedHead.");
    }
}
