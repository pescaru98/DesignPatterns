package creational.abstractfactory.validators;

import creational.abstractfactory.abstracts.Validator;
import creational.abstractfactory.abstracts.CreditCard;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
