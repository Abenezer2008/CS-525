package strategy;

public class MuteQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("Can't Quack.");
    }
}
