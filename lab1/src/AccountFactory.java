public class AccountFactory {
    private static AccountType checking = new Checking();
    private static AccountType saving = new Saving();

    public static AccountType getChecking(){
        return checking;
    }
    public static AccountType getSaving(){
        return saving;
    }
}
