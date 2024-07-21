package behavioural.template;

public class PaymentToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Payment to Merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount paid to Merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount paid to Merchant");
    }

    @Override
    public void calculateFee() {
        System.out.println("Payment to merchant");
    }
}
