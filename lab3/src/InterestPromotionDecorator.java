public abstract class InterestPromotionDecorator implements AccountType{
    private AccountType accountType;
    InterestPromotionDecorator(AccountType accountType){
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
