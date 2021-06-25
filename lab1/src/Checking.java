public class Checking implements AccountType{
    
    @Override
    public double getInterest(double balance) {
        if(balance < 1000){
            return balance * 0.015;
        }else {
            return balance*0.025;
        }
    }
}
