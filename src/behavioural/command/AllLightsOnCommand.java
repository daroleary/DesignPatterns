package behavioural.command;

import java.util.List;

public class AllLightsOnCommand implements Command {

    private List<Light> _lights;

    public AllLightsOnCommand(List<Light> lights) {
        _lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : _lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
