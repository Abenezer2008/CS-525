package strategy;

public class DecoyDuck extends Duck{
    DecoyDuck(){
        quackable = new MuteQuack();
        flyable = new FlyNoWay();
    }
    @Override
    void display() {
        System.out.println("Display Decoy.");
    }
}
