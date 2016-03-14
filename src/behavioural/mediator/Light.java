package behavioural.mediator;

// receiver
public class Light {

    private boolean isOn = false;
    private String _location = "";

    public Light(String location) {
	_location = location;
    }

    public boolean isOn() {
	return isOn;
    }

    public boolean isOff() {
	return !isOn();
    }

    public void toggle() {
	if (isOn) {
	    off();
	    isOn = false;
	} else {
	    on();
	    isOn = true;
	}
    }

    private void on() {
	System.out.println("Light switched on");
    }

    private void off() {
	System.out.println("Light switched off");
    }
}
