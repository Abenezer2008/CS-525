package factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza chicagoCheesePizza = chicagoStore.createPizza("cheese");

        System.out.println("Brandon Ordered : " + chicagoCheesePizza.getName());

        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza nyCheesePizza = nyStore.createPizza("cheese");

        System.out.println("Leslie Ordered : " + nyCheesePizza.getName());


    }
}