package behavioural.chainofresponsibility;

public abstract class Handler {

    protected Handler _successor;

    public void setSuccessor(Handler successor) {
	_successor = successor;
    }

    public abstract void handleRequest(Request request);
}
