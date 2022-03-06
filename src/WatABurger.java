import Restaurant.Bawarchi;
import Restaurant.SpiceUp;
import Restaurant.TheTable;

public class WatABurger {
    private Bawarchi bawarchi;
    private TheTable theTable;
    private SpiceUp spiceUp;
    private String burger;

    public WatABurger(){
        //TODO: Area of change, we are violation out first design Principle
        bawarchi = new Bawarchi();
        theTable = new TheTable();
        spiceUp = new SpiceUp();
    }

    public void notifyRestro(){
        //TODO: Area of change, we must encapsulate it
        bawarchi.serve(burger);
        theTable.serve(burger);
        spiceUp.serve(burger);
    }

    public void prepareBurger(String burger) {
        this.burger = burger;
    }
}
