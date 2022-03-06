package Subject;

import Restaurant.Bawarchi;
import Restaurant.IObserver;
import Restaurant.SpiceUp;
import Restaurant.TheTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WatABurger implements ISubject{
    private Map<String,IObserver> observerMap;
    private String burger;

    public WatABurger(){
        observerMap = new HashMap<>();
    }

    @Override
    public void register(IObserver observer) {
        observerMap.put(observer.getId(),observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerMap.remove(observer.getId());
    }

    @Override
    public void notifyObserver() {
        for (var entity: observerMap.entrySet()) {
            entity.getValue().update(burger);
        }
    }

    public void prepareBurger(String burger) {
        this.burger = burger;
    }
}
