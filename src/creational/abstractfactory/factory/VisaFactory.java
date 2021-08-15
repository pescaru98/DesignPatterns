package creational.abstractfactory.factory;

import creational.abstractfactory.abstracts.CardType;
import creational.abstractfactory.abstracts.CreditCard;
import creational.abstractfactory.abstracts.CreditCardFactory;
import creational.abstractfactory.abstracts.Validator;
import creational.abstractfactory.creditcards.VisaBlackCreditCard;
import creational.abstractfactory.creditcards.VisaGoldCreditCard;
import creational.abstractfactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case BLACK:
                return new VisaBlackCreditCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
