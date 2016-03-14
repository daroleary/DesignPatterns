package behavioural.command;

// concrete command
public class ToggleCommand implements Command {

    private Light _light;

    public ToggleCommand(Light light) {
        _light = light;
    }

    @Override
    public void execute() {
        _light.toggle();
    }
}
