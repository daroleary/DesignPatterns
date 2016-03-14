package behavioural.command;

import java.util.ArrayList;
import java.util.List;

// client
public class CommandDemo {

    public static void main(String[] args) {

	Light bedroomLight = new Light();
	Light kitchenLight = new Light();
	Switch lightSwitch = new Switch();

	Command toggleCommand = new ToggleCommand(bedroomLight);

	lightSwitch.storeAndExecute(toggleCommand); // on
	lightSwitch.storeAndExecute(toggleCommand); // off
	lightSwitch.storeAndExecute(toggleCommand); // on

	System.out.println();

	List<Light> lights = new ArrayList<>();
	lights.add(kitchenLight);
	lights.add(bedroomLight);

	Command allLightsCommand = new AllLightsOnCommand(lights);

	// only turns off lights which are on
	lightSwitch.storeAndExecute(allLightsCommand);
    }
}
