public class Saving implements AccountType{
    
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
}
