package behavioural.template;

public abstract class PaymentFlow {
     public abstract void validateRequest();
     public abstract void debitAmount();
     public abstract void creditAmount();
     public abstract void calculateFee();

     public final void SendMoney(){
         validateRequest();
         debitAmount();
         creditAmount();
         calculateFee();
     }
}
