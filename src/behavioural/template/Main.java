package behavioural.template;

// when to use
// When you want all classes to follow the specific steps to process the task but also
// Need to provide flexibility that each class can have their own logic in that specific steps.

/*
* consider a scenario where you are paying to your friend and merchant
* steps need to follow in each flow
* 1) Validate request 2) Debit money 3) Compute fees 4) credit money

* */

public class Main {
    public static void main(String[] args) {
        PaymentToFriend paymentToFriend = new PaymentToFriend();
        paymentToFriend.SendMoney();
        PaymentToMerchant paymentToMerchant = new PaymentToMerchant();
        paymentToMerchant.SendMoney();
    }
}
