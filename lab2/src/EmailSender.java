public class EmailSender implements Observer{
    AccountService subject;

    EmailSender(AccountService subject){
        this.subject = subject;
    }
    @Override
    public void update(Account account,Change change) {
        if(change == Change.CREATE)
        System.out.println(
                "===================================\n" +
                "Sending Email at account creation.\n" +
                "===================================");
    }
}
