package behavioral.command.concrete_command;

import behavioral.command.receiver.Light;
import behavioral.command.command.Command;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if(light.isOn())
                light.toggle();
        }
    }
}
