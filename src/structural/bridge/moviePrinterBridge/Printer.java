package structural.bridge.moviePrinterBridge;

import java.util.List;

/**
 * Added to demonstrate the bridge
 */
public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
