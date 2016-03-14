package behavioural.state;

public class FanMediumState extends State {

    private Fan _fan;

    public FanMediumState(Fan fan) {
        _fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to high ...");
        _fan.setState(_fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is medium.";
    }
}
