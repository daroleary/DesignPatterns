package behavioural.state;

public class FanOffState extends State {

    private Fan _fan;

    public FanOffState(Fan fan) {
        _fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to low ...");
        _fan.setState(_fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }
}
