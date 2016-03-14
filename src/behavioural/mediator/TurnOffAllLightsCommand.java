package behavioural.mediator;

// concrete command
public class TurnOffAllLightsCommand implements Command {

    private Mediator _mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
	_mediator = mediator;
    }

    @Override
    public void execute() {
        _mediator.turnOffAllLights();
    }
}
