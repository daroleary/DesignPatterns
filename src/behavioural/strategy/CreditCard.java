package behavioural.strategy;

public class CreditCard {

    protected String _number;
    protected String _date;
    private String _cvv;
    private ValidationStrategy _strategy;

    public CreditCard(ValidationStrategy strategy) {
	_strategy = strategy;

    }

    public boolean isValid() {
	return _strategy.isValid(this);
    }

    public String getNumber() {
	return _number;
    }

    public void setNumber(String number) {
	_number = number;
    }

    public String getDate() {
	return _date;
    }

    public void setDate(String date) {
	_date = date;
    }

    public String getCvv() {
	return _cvv;
    }

    public void setCvv(String cvv) {
	_cvv = cvv;
    }
}
