package structural.bridge.moviePrinterBridge;

import java.util.List;

/**
 * Added in 2nd video to show that we can add new formatter, independent of Printer
 */
public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>")
                .append("<th>")
                .append("Classification")
                .append("</th>")
                .append("<th>")
                .append(header)
                .append("</th>");

        for (Detail detail : details) {
            builder.append("<tr><td>")
                    .append(detail.getLabel())
                    .append("</td><td>")
                    .append(detail.getValue())
                    .append("</td></tr>");
        }
        builder.append("</table>");

        return builder.toString();
    }
}
