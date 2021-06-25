package observer;

public class Application {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver(subject);

        subject.addObserver(observer);

        subject.setBalance(100d);

        subject.setBalance(102d);

        subject.setBalance(104d);
    }
}
