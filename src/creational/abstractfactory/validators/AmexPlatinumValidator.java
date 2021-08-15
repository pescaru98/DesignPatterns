package creational.abstractfactory.validators;

import creational.abstractfactory.abstracts.Validator;
import creational.abstractfactory.abstracts.CreditCard;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
