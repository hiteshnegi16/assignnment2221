public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentMethod = new PayPalPayment();
        PetStore store = new PetStore(paymentMethod);
        store.processOrder(100.0);

        // You can easily switch to another payment method without changing PetStore code.
        PaymentProcessor anotherPaymentMethod = new CreditCardPayment();
        PetStore anotherStore = new PetStore(anotherPaymentMethod);
        anotherStore.processOrder(150.0);

    }
}
