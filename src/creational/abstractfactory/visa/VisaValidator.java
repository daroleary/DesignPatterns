package creational.abstractfactory.visa;

import creational.abstractfactory.CreditCard;
import creational.abstractfactory.Validator;

public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
	return true;
    }
}
