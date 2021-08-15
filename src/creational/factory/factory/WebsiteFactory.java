package creational.factory.factory;

import creational.factory.abstracts.Website;
import creational.factory.websites.Blog;
import creational.factory.websites.Shop;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType){
            case BLOG: return new Blog();
            case SHOP: return new Shop();
            default: return null;
        }
    }
}
