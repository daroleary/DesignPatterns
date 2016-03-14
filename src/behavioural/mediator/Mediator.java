package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Light> _lights = new ArrayList<>();

    public void registerLight(Light light) {
	_lights.add(light);
    }

    // Object maintains its own state, mediator determines whether to call it or not
    public void turnOnAllLights() {
	for (Light light : _lights) {
	    if (light.isOff()) {
		light.toggle();
	    }
	}
    }

    public void turnOffAllLights() {
	for (Light light : _lights) {
	    if (light.isOn()) {
		light.toggle();
	    }
	}
    }
}
