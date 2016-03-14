package behavioural.state;

public class FanLowState extends State {

    private Fan _fan;

    public FanLowState(Fan fan) {
        _fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to medium ...");
        _fan.setState(_fan.getFanMediumState());
    }

    @Override
    public String toString() {
        return "Fan is low.";
    }
}
