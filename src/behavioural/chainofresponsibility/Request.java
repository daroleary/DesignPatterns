package behavioural.chainofresponsibility;

public class Request {

    private RequestType _requestType;
    private double _amount;

    public Request(RequestType requestType, double amount) {

	_requestType = requestType;
	_amount = amount;
    }

    public RequestType getRequestType() {
	return _requestType;
    }

    public double getAmount() {
	return _amount;
    }
}
