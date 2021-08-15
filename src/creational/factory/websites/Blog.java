package creational.factory.websites;

import creational.factory.abstracts.Website;
import creational.factory.pages.CommentPage;
import creational.factory.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
    }
}
