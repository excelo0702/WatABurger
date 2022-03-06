package Restaurant;

import Subject.WatABurger;

public class SpiceUp implements IRestaurant,IObserver{
    private WatABurger watABurger;

    public SpiceUp(WatABurger watABurger){
        this.watABurger = watABurger;
    }

    @Override
    public void serve(String pizza) {
        System.out.println("Here SpiceUp! We serve wat-a-burgers pizza: "+ pizza);
    }

    @Override
    public String getId() {
        return "SpiceUp";
    }

    @Override
    public void update() {
        String pizza = watABurger.getPizza();
        serve(pizza);
    }
}
