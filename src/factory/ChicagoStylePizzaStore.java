package factory;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type == "cheese"){
            pizza = new ChicagoStyleCheesePizza();
        }
        if(type == "pepperoni"){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
