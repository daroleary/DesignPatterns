package creational.builder.bean;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {

	LunchOrderBean lunchOrderBean = new LunchOrderBean();

	lunchOrderBean.setBread("Wheat");
	lunchOrderBean.setCondiment("Lettuce");
	lunchOrderBean.setDressing("Mustard");
	lunchOrderBean.setMeat("Ham");

	System.out.println(lunchOrderBean.getBread());
	System.out.println(lunchOrderBean.getCondiment());
	System.out.println(lunchOrderBean.getDressing());
	System.out.println(lunchOrderBean.getMeat());
    }
}
