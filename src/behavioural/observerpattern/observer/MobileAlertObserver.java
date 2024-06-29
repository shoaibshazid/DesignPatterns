package behavioural.observerpattern.observer;

import behavioural.observerpattern.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    public int mobileNumber;
    StocksObservable observable;

    public MobileAlertObserver(int mobileNumber, StocksObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMobileUpdate(mobileNumber);
    }
    private void sendMobileUpdate(int mobileNumber) {
        System.out.println("MobileAlertObserver: sendMobileUpdate");
        System.out.println("MobileAlertObserver: mobileNumber: " + mobileNumber);
    }
}
