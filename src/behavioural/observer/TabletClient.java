package behavioural.observer;

public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
	_subject = subject;
	subject.attach(this);
    }

    public void addMessage(String message) {
	_subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
	System.out.println("Tablet Stream: " + _subject.getState());
    }
}
