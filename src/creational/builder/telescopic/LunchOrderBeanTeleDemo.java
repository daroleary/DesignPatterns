package creational.builder.telescopic;

public class LunchOrderBeanTeleDemo {

    public static void main(String[] args) {

	LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat","Lettuce","Mustard","Ham");

	System.out.println(lunchOrderTele.getBread());
	System.out.println(lunchOrderTele.getCondiment());
	System.out.println(lunchOrderTele.getDressing());
	System.out.println(lunchOrderTele.getMeat());
    }
}
