public class Promotion2 extends InterestPromotionDecorator{
    Promotion2(AccountType accountType) {
        super(accountType);
    }

    @Override
    public double getInterest(double balance) {
        return getAccountType().getInterest(balance) + (balance * 0.2)  ;
    }

    @Override
    public String getDescription() {
        //Updating Description.
        return getAccountType().getDescription() + ", Promotion 2";
    }
}
