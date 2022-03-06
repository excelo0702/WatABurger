package Restaurant;

import Subject.WatABurger;

public class Bawarchi implements IRestaurant, IObserver{
    private WatABurger watABurger;

    public Bawarchi(WatABurger watABurger){
        this.watABurger = watABurger;
        watABurger.register(this);
    }

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
