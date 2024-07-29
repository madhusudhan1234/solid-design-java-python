// Main.java
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    NotificationChannel emailService = new EmailService();
    NotificationChannel smsService = new SMSService();

    NotificationService notificationService = new NotificationService(Arrays.asList(emailService, smsService));
    notificationService.sendNotification("Hello, World!");
  }
}