package observer;

public class ConcreteObserver implements Observer{
    ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject){
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println(subject.getBalance());
    }
}
