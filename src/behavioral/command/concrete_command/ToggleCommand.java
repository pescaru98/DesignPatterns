package behavioral.command.concrete_command;

import behavioral.command.receiver.Light;
import behavioral.command.command.Command;

public class ToggleCommand implements Command {
    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
