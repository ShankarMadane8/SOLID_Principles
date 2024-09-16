package dip;

//Low-level module 2
public class PhonePayPaymentGateway implements PaymentGateway {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing payment through PhonePay: " + amount);
 }
}
