package behavioural.observer;

public abstract class Observer {

    protected Subject _subject;

    abstract void update();
}
