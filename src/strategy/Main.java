package strategy;

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck mallardDuck = new MallardDuck();
        Duck redHead = new RedHead();

        System.out.println(rubberDuck);
    }
}
