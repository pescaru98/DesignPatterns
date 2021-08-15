package creational.abstractfactory;

import creational.abstractfactory.abstracts.CardType;
import creational.abstractfactory.abstracts.CreditCardFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(680);

        System.out.println(creditCardFactory.getCreditCard(CardType.GOLD));

        CreditCardFactory creditCardFactory2 = CreditCardFactory.getCreditCardFactory(60);

        System.out.println(creditCardFactory2.getCreditCard(CardType.GOLD));
    }
}
