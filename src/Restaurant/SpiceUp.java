package Restaurant;

import Subject.WatABurger;

public class SpiceUp implements IRestaurant,IObserver{
    private WatABurger watABurger;

    public SpiceUp(WatABurger watABurger){
        this.watABurger = watABurger;
        watABurger.register(this);
    }

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
