package dip;

public class DependencyInversionPrinciple {
	 public static void main(String[] args) {
		 
		 
	        PaymentGateway paymentGateway = new PayPalPaymentGateway(); 
	        OrderService orderService = new OrderService(paymentGateway);
	        orderService.placeOrder(100.00);
	        
	   	        
	        PaymentGateway paymentGateway1 = new PhonePayPaymentGateway(); 
	        OrderService orderService1 = new OrderService(paymentGateway1);
	        orderService1.placeOrder(200.00);
	        	        
	}
}
