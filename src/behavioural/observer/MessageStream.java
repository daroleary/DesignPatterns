package behavioural.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

    private Deque<String> _messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
	_messageHistory.add(message);
	this.notifyObservers();
    }

    @Override
    String getState() {
	return _messageHistory.getLast();
    }
}
