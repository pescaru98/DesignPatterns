package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try{
            item = (Item)(items.get(type)).clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setPrice(22.90);
        movie.setTitle("Basic Movi");
        movie.setRuntime("2h");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(5);
        book.setTitle("Basic book");
        book.setPrice(11.55);
        items.put("Book", book);
    }
}
