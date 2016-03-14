package behavioural.observer;

public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
	_subject = subject;
	subject.attach(this);
    }

    public void addMessage(String message) {
	_subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
	System.out.println("Phone Stream: " + _subject.getState());
    }
}
