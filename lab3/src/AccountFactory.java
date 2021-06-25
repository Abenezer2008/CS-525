public class AccountFactory {
    private static AccountType checking = new CheckingType();
    private static AccountType saving = new SavingType();

    public static AccountType getChecking(){
        return checking;
    }
    public static AccountType getSaving(){
        return saving;
    }
}
