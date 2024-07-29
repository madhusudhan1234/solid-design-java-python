// PaymentMethodFactory.java
public class PaymentMethodFactory {
  public static PaymentMethod getPaymentMethod(String paymentType) {
    if (paymentType.equalsIgnoreCase("PayPal")) {
      return new PayPalPayment();
    } else if (paymentType.equalsIgnoreCase("CreditCard")) {
      return new CreditCardPayment();
    } else {
      throw new IllegalArgumentException("Unsupported payment method: " + paymentType);
    }
  }
}