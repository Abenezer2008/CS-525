public class SavingType implements AccountType{
    private String description;
    public SavingType(){
        this.description = "Saving Type";
    }
    @Override
    public double getInterest(double balance) {
        if(balance < 1000){
           return balance * 0.01;
        }else if(balance > 5000) {
           return balance * 0.04;
        }else {
           return balance * 0.02;
        }
    }

    @Override
    public String  getDescription() {
        return this.description;
    }
}
