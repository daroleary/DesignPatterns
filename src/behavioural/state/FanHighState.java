package behavioural.state;

public class FanHighState extends State {

    private Fan _fan;

    public FanHighState(Fan fan) {
        _fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off ...");
        _fan.setState(_fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high.";
    }
}
