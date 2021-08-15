package creational.abstractfactory.abstracts;

import creational.abstractfactory.abstracts.CreditCard;

public abstract interface Validator {
    abstract boolean isValid(CreditCard creditCard);
}
