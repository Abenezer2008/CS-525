public class SMSSender implements Observer{
    AccountService subject;
    double previousBalance;
    double currentBalance;
    SMSSender(AccountService subject){
        this.subject = subject;
    }
    @Override
    public void update(Account account, Change change) {
        if(change == Change.UPDATE){
            this.previousBalance = currentBalance;
            this.currentBalance = account.getBalance();
            System.out.println(
                    "=====================================\n" +
                            "Sending SMS : \n" +
                            "Detected Change in Account : " + account.getAccountNumber() + "\n" +
                            "Previous Balance : " + this.previousBalance + "\n" +
                            "Current Balance : " + this.currentBalance + "\n" +
                            "=====================================");
        }
    }

}
