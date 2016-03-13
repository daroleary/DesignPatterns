package creational.abstractfactory;

// AbstractProduct
public abstract class CreditCard {

    protected int _cardNumberLenght;
    protected int _cscNumber;

    public int getCardNumberLenght() {
	return _cardNumberLenght;

    }

    public void setCardNumberLenght(int cardNumberLenght) {
	_cardNumberLenght = cardNumberLenght;
    }

    public int getCscNumber() {
	return _cscNumber;
    }

    public void setCscNumber(int cscNumber) {
	_cscNumber = cscNumber;
    }
}
