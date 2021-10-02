package behavioral.command.concrete_command;

import behavioral.command.receiver.Light;
import behavioral.command.command.Command;

/**
 * This is "ConcreteCommand"
 */
public class OnCommand implements Command {
    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
