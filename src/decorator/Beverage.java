package decorator;

public abstract class Beverage {
   String description;

   public abstract double cost();

   public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Beverage remove(){
       return this;
    }
}
