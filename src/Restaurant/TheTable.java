package Restaurant;

public class TheTable implements IRestaurant{
    @Override
    public void serve(String burger) {
        System.out.println("Here The Table! We serve wat-a-burgers: "+ burger);
    }
}
