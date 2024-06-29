package behavioural.observerpattern.observable;

import behavioural.observerpattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void setStock(int stock);
    int getStock();
}
