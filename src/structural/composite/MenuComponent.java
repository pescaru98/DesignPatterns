package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a component
 */
public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

/*    public MenuComponent(String name, String url){
        this.name = name;
        this.url = url;
    }

    public MenuComponent(){}*/

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    public String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);

        builder.append(": ")
                .append(url)
                .append("\n");

        return builder.toString();
    }
}
