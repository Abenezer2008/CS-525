public class CheckingType implements AccountType{
    private String description;
    CheckingType(){
        this.description = "Checking Type";
    }
    @Override
    public double getInterest(double balance) {
        if(balance < 1000){
            return balance * 0.015;
        }else {
            return balance*0.025;
        }
    }

    @Override
    public String getDescription() {
        return this.description;
    }


}
