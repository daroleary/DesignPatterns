package creational.abstractfactory.amex;

import creational.abstractfactory.CardType;
import creational.abstractfactory.CreditCard;
import creational.abstractfactory.CreditCardFactory;
import creational.abstractfactory.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
	switch (cardType) {
	    case GOLD:
		// could use Template method pattern
		return new AmexGoldCreditCard();
	    case PLATINUM:
		return new AmexPlatinumCreditCard();
	}
	return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

	switch (cardType) {
	    case GOLD:
		return new AmexGoldValidator();
	    case PLATINUM:
		return new AmexPlatinumValidator();
	}
	return null;
    }
}
