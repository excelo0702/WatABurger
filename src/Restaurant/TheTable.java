package Restaurant;

public class TheTable implements IRestaurant,IObserver{
    @Override
    public void serve(String burger) {
        System.out.println("Here The Table! We serve wat-a-burgers: "+ burger);
    }

    @Override
    public String getId() {
        return "TheTable";
    }

    @Override
    public void update(String burger) {
        System.out.println(" Update Burger ");
        serve(burger);
    }
}
