import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observerList.remove(observer);
    }
    public void notifyAllObservers(Account account,Change change){
        observerList.forEach(observer -> observer.update(account,change));
    }
}
