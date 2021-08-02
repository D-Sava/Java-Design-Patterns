import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int state;
    private List<Observer> observers = new ArrayList<>();

    public int getState(){
        return this.state;
    }

    public void setState(int value){
        this.state = value;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void attachObserver(Observer observer){
        observers.add(observer);
    }
}
