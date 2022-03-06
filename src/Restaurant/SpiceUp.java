package Restaurant;

public class SpiceUp implements IRestaurant{
    @Override
    public void serve(String burger) {
        System.out.println("Here SpiceUp! We serve wat-a-burgers: "+ burger);
    }
}
