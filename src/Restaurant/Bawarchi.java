package Restaurant;

public class Bawarchi implements IRestaurant{
    @Override
    public void serve(String burger) {
        System.out.println("Here Bawarchi! We serve wat-a-burgers: "+ burger);
    }
    //other methods
}
