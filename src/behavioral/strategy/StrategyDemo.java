package behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("785");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("322472724523");
        amexCard2.setDate("04/2017");
        amexCard2.setCvv("223");

        System.out.println("Is Amex2 valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("950");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
