public class Promotion1 extends InterestPromotionDecorator{
    Promotion1(AccountType accountType) {
        super(accountType);
    }
    @Override
    public double getInterest(double balance) {
        return getAccountType().getInterest(balance) + (balance * 0.1)  ;
    }

    @Override
    public String getDescription() {
        // Updating Description.
        return getAccountType().getDescription() + ", Promotion 1";
    }
}
