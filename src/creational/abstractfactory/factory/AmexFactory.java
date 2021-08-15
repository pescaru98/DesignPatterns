package creational.abstractfactory.factory;

import creational.abstractfactory.abstracts.CardType;
import creational.abstractfactory.abstracts.CreditCard;
import creational.abstractfactory.abstracts.CreditCardFactory;
import creational.abstractfactory.abstracts.Validator;
import creational.abstractfactory.creditcards.AmexGoldCreditCard;
import creational.abstractfactory.creditcards.AmexPlatinumCreditCard;
import creational.abstractfactory.validators.AmexGoldValidator;
import creational.abstractfactory.validators.AmexPlatinumValidator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD: return new AmexGoldCreditCard();
            case PLATINUM: return new AmexPlatinumCreditCard();
            default: break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD: return new AmexGoldValidator();
            case PLATINUM: return new AmexPlatinumValidator();
            default: break;
        }
        return null;
    }
}
