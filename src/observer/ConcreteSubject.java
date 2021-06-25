package observer;

public class ConcreteSubject extends Subject{
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
        notifyAllObservers();
    }
}
