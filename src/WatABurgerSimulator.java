public class WatABurgerSimulator {
    public static void main(String[] args) {
        WatABurger watABurger = new WatABurger();

        System.out.println("\n\n!!!New Burger Added!!!\n\n");
        watABurger.prepareBurger(" Spinach Burger ");

        System.out.println("\n\n!!!We must notify all of our subscribers about our new burger!!!\n\n");
        watABurger.notifyRestro();
    }
}
