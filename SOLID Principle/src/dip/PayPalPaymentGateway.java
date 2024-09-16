package dip;

public class PayPalPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through PayPal: " + amount);
    }
}
