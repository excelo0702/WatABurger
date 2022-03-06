package Restaurant;

public class Bawarchi implements IRestaurant, IObserver{
    @Override
    public void serve(String burger) {
        System.out.println("Here Bawarchi! We serve wat-a-burgers: "+ burger);
    }

    @Override
    public String getId() {
        return "Bawarchi";
    }

    @Override
    public void update(String burger) {
        System.out.println(" Update Burger ");
        serve(burger);
    }

    //other methods
}
