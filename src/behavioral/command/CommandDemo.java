package behavioral.command;

import behavioral.command.concrete_command.AllLightsCommand;
import behavioral.command.command.Command;
import behavioral.command.concrete_command.ToggleCommand;
import behavioral.command.invoker.Switch;
import behavioral.command.receiver.Light;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        Switch lightSwitch = new Switch();

        Command onCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(onCommand);
//        lightSwitch.storeAndExecute(onCommand);
//        lightSwitch.storeAndExecute(onCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
