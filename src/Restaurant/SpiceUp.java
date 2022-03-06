package Restaurant;

public class SpiceUp implements IRestaurant,IObserver{
    @Override
    public void serve(String burger) {
        System.out.println("Here SpiceUp! We serve wat-a-burgers: "+ burger);
    }

    @Override
    public String getId() {
        return "SpiceUp";
    }

    @Override
    public void update(String burger) {
        System.out.println(" Update Burger ");
        serve(burger);
    }
}
