package decorator;

public class Sugar extends CondimentDecorator{

    public Sugar(Beverage beverage){
        super(beverage);
    }

    @Override
    public double cost() {
        return this.getBeverage().cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + ", Sugar";
    }
}
