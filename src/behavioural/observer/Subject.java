package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> _observers = new ArrayList<>();

    abstract void setState(String state);

    abstract String getState();

    public void attach(Observer observer) {
	_observers.add(observer);
    }

    public void dettach(Observer observer) {
	_observers.remove(observer);
    }

    public void notifyObservers() {
	for (Observer observer : _observers) {
	    observer.update();
	}
    }
}
