// Main.java
public class Main {
  public static void main(String[] args) {
    String paymentType1 = "PayPal";
    String paymentType2 = "CreditCard";

    PaymentProcessor processor = new PaymentProcessor();

    PaymentMethod paymentMethod1 = PaymentMethodFactory.getPaymentMethod(paymentType1);
    processor.processPayment(paymentMethod1);

    PaymentMethod paymentMethod2 = PaymentMethodFactory.getPaymentMethod(paymentType2);
    processor.processPayment(paymentMethod2);
  }
}