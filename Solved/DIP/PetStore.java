public class PetStore {
    private final PaymentProcessor paymentProcessor;

    public PetStore(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(double amount) {
        paymentProcessor.process(amount);
    }
}