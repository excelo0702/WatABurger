package Restaurant;

import Subject.WatABurger;

public class TheTable implements IRestaurant,IObserver{
    private WatABurger watABurger;

    public TheTable(WatABurger watABurger){
        this.watABurger = watABurger;
    }

    @Override
    public void serve(String burger) {
        System.out.println("Here The Table! We serve wat-a-burgers: "+ burger);
    }

    @Override
    public String getId() {
        return "TheTable";
    }

    @Override
    public void update() {
        String burger = watABurger.getBurger();
        serve(burger);
    }
}
