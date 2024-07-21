package behavioural.template;

public class PaymentToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Payment to Friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount payment to Friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount payment to Friend");
    }

    @Override
    public void calculateFee() {
        System.out.println("Payment to Friend calculate fee");
    }
}
