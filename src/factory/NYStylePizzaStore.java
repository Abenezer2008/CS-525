package factory;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type == "cheese"){
            pizza = new NYStyleCheesePizza();
        }
        if(type == "pepperoni"){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
