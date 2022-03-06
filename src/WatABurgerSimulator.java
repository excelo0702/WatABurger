import Restaurant.Bawarchi;
import Restaurant.SpiceUp;
import Restaurant.TheTable;
import Subject.WatABurger;

public class WatABurgerSimulator {
    public static void main(String[] args) {
        WatABurger watABurger = new WatABurger();

        System.out.println("\n Register our subscribers\n");
        Bawarchi bawarchi = new Bawarchi(watABurger);
        SpiceUp spiceUp = new SpiceUp(watABurger);
        TheTable theTable = new TheTable(watABurger);

        System.out.println("\n!!!New Burger Added!!!\n");
        watABurger.prepareBurger(" Spinach Burger ");

        System.out.println("\n!!!We must notify all of our subscribers about our new burger!!!\n");
        watABurger.notifyObserver();

        System.out.println("\n\n The Table Observer is not happy with Wat-a-Burger burgers, The Table wants to unsubscribe it");
        watABurger.remove(theTable);

        System.out.println("\n\n!!!New Burger Added!!!\n\n");
        watABurger.prepareBurger(" Italic Burger ");

        System.out.println("\n\n!!!We must notify all of our subscribers about our new burger!!!\n\n");
        watABurger.notifyObserver();
    }
}
