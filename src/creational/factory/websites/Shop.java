package creational.factory.websites;

import creational.factory.abstracts.Website;
import creational.factory.pages.CartPage;
import creational.factory.pages.ItemPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}
