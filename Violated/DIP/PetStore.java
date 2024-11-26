public class PetStore {
    private final CreditCardPayment paymentProcessor;

    public PetStore() {
        this.paymentProcessor = new CreditCardPayment();
    }

    public void processOrder(double amount) {
        paymentProcessor.process(amount);
    }
}