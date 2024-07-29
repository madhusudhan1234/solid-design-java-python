// PayPalPayment.java
public class PayPalPayment implements PaymentMethod {
	@Override
	public void processPayment() {
		System.out.println("Processing payment through PayPal");
	}
}
