package structural.composite;

public class CompositeMenuDemo {

    public static void main(String[] args) {

	Menu mainMenu = new Menu("Main", "/main");

	MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

	mainMenu.add(safetyMenuItem);

	Menu claimSubmenu = new Menu("Claims", "/claims");

	mainMenu.add(claimSubmenu);

	MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

	claimSubmenu.add(personalClaimsMenu);

	System.out.println(mainMenu.toString());
    }
}
