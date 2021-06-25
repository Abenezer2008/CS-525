package decorator;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Milk";
    }
}
