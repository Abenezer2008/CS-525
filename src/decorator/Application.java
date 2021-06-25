package decorator;

public class Application {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost());

        Milk milk = new Milk(darkRoast);
        System.out.println(milk.getDescription() + " " + milk.cost());

        Sugar sugar = new Sugar(milk);
        System.out.println(sugar.getDescription() + " " + sugar.cost());

        Beverage beverage = sugar.remove();
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage1 = beverage.remove();
        System.out.println(beverage1.getDescription() + " " + beverage1.cost());

        Beverage beverage2 = beverage.remove();
        System.out.println(beverage2.getDescription() + " " + beverage2.cost());
    }
}
