// Main.java
public class Main {
  public static void main(String[] args) {
    PaymentProcessor processor = new PaymentProcessor();
    processor.processPayment("PayPal");
    processor.processPayment("CreditCard");
  }
}