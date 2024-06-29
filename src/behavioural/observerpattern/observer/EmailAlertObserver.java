package behavioural.observerpattern.observer;

import behavioural.observerpattern.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId);
    }

    private void sendMail(String subject) {
        System.out.println("Sending email to " + subject);
        System.out.println("Subject: " + "product is in stock hurry up");
    }
}
