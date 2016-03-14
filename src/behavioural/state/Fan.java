package behavioural.state;

import static behavioural.state.FanState.*;

public class Fan {

    private State _fanOffState;
    private State _fanLowState;
    private State _fanMediumState;
    private State _fanHighState;
    private State _highState;

    State _state;

    public Fan() {
	_fanOffState = new FanOffState(this);
	_fanLowState = new FanLowState(this);
	_fanMediumState = new FanMediumState(this);
	_fanHighState = new FanHighState(this);

	_state = _fanOffState;
    }

    public void pullChain() {
	_state.handleRequest();
    }

    public State getFanOffState() {
	return _fanOffState;
    }

    public State getFanLowState() {
	return _fanLowState;
    }

    public State getFanMediumState() {
	return _fanMediumState;
    }

    public State getFanHighState() {
	return _fanHighState;
    }

    public void setState(State state) {
	_state = state;
    }

    @Override
    public String toString() {
	return _state.toString();
    }
}
