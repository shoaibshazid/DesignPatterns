package behavioural.observerpattern;

import behavioural.observerpattern.observable.IphoneObservable;
import behavioural.observerpattern.observable.StocksObservable;
import behavioural.observerpattern.observer.EmailAlertObserver;
import behavioural.observerpattern.observer.MobileAlertObserver;
import behavioural.observerpattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver(223223, iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStock(10);
        iphoneStockObservable.setStock(10);

        iphoneStockObservable.remove(observer1);

        iphoneStockObservable.notifyObservers();

        int count = iphoneStockObservable.getStock();
        System.out.println(count);

    }
}
