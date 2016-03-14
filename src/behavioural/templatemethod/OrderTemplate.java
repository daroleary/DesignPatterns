package behavioural.templatemethod;

public abstract class OrderTemplate {

    // hook
    public boolean isGift;

    // operations
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
	System.out.println("Gift wrapped.");
    }

    // algorithm doesn't change among concrete implementations
    public final void processOrder() {
	doCheckout();
	doPayment();
	if (isGift) {
	    wrapGift();
	} else {
	    doReceipt();
	}
	doDelivery();
    }
}
