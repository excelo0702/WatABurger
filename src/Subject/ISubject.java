package Subject;

import Restaurant.IObserver;

public interface ISubject {
    void register(IObserver observer);
    void remove(IObserver observer);
    void notifyObserver();
}
