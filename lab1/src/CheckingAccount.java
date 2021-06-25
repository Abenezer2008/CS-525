public class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber) {
        super(accountNumber,AccountFactory.getChecking());
    }
    public void hello(){}

}
