public class Promotion3 extends InterestPromotionDecorator{
    Promotion3(AccountType accountType) {
        super(accountType);
    }

    @Override
    public double getInterest(double balance) {
        return getAccountType().getInterest(balance) + (balance * 0.3)  ;
    }

    @Override
    public String getDescription() {
        //Updating Description
        return getAccountType().getDescription() + ", Promotion 3";
    }
}
