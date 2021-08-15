package creational.factory;

import creational.factory.abstracts.Website;
import creational.factory.factory.WebsiteFactory;
import creational.factory.factory.WebsiteType;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }
}
