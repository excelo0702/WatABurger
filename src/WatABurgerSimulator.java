import Restaurant.Bawarchi;
import Restaurant.SpiceUp;
import Restaurant.TheTable;
import Subject.WatABurger;

public class WatABurgerSimulator {
    public static void main(String[] args) {
        WatABurger watABurger = new WatABurger();

        System.out.println("\n Register our subscribers\n");
        watABurger.register(new Bawarchi(watABurger));
        watABurger.register(new TheTable(watABurger));
        watABurger.register(new SpiceUp(watABurger));

        System.out.println("\n!!!New Burger Added!!!\n");
        watABurger.prepareBurger(" Spinach Burger ");
        System.out.println("\n\n!!!New Pizza Added!!!\n\n");
        watABurger.preparePizza(" Italic Pizza ");

        System.out.println("\n!!!We must notify all of our subscribers about our new burger!!!\n");
        watABurger.notifyObserver();



        System.out.println("\n\n!!!We must notify all of our subscribers about our new burger!!!\n\n");
        watABurger.notifyObserver();
    }
}
