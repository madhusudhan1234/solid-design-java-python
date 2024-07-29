// PaymentProcessor.java
public class PaymentProcessor {
  public void processPayment(String paymentType) {
    if (paymentType.equals("PayPal")) {
      System.out.println("Processing payment through PayPal");
    } else if (paymentType.equals("CreditCard")) {
      System.out.println("Processing payment through Credit Card");
    } else {
      System.out.println("Unsupported payment method");
    }
  }
}

