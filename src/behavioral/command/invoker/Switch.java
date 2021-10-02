package behavioral.command.invoker;

import behavioral.command.command.Command;

/**
 * This is "Invoker"
 */
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
