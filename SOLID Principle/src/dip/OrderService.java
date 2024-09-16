package dip;

//High-level module
public class OrderService {
 private PaymentGateway paymentGateway;

 public OrderService(PaymentGateway paymentGateway) {
     this.paymentGateway = paymentGateway;
 }

 public void placeOrder(double amount) {
     // Place the order logic
     paymentGateway.processPayment(amount);
 }
}
