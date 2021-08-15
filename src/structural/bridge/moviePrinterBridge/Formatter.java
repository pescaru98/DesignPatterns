package structural.bridge.moviePrinterBridge;

import java.util.List;

/**
 * Added to demonstrate the bridge
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
