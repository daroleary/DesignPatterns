package behavioural.mediator;

// concrete command
public class TurnOnAllLightsCommand implements Command {

    private Mediator _mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
	_mediator = mediator;
    }

    @Override
    public void execute() {
        _mediator.turnOnAllLights();
    }
}
