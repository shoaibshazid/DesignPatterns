package behavioural.observerpattern.observable;

import behavioural.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;


public class IphoneObservable implements StocksObservable {

    public List<NotificationAlertObserver> observersList = new ArrayList<>();
    public int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if(stockCount == 0) {
            notifyObservers();
        }
        stockCount += stock;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
