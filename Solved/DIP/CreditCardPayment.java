public class CreditCardPayment implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}