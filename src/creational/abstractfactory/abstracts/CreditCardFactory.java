package creational.abstractfactory.abstracts;

import creational.abstractfactory.factory.AmexFactory;
import creational.abstractfactory.factory.VisaFactory;

/**
 * Abstract factory is a factory of factories.
 * Usually, abstract factory comes as a refactor from factory pattern,
 * since people don't often visualize using AbstractFactory to begin with
 */
public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore){
        if(creditScore > 650){
            return new AmexFactory();
        }else{
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
