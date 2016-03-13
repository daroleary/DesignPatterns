package creational.builder.builder;

public class LunchOrderDemo {

    public static void main(String[] args) {

	LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();

	LunchOrder lunchOrder = lunchOrderBuilder
		.bread("Wheat")
		.condiment("Lettuce")
		.dressing("Mustard")
		.meat("Ham")
		.build();

	System.out.println(lunchOrder.getBread());
	System.out.println(lunchOrder.getCondiment());
	System.out.println(lunchOrder.getDressing());
	System.out.println(lunchOrder.getMeat());
    }
}
