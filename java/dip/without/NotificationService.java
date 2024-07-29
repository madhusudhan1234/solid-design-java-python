// NotificationService.java
public class NotificationService {
  private EmailService emailService;
  private SMSService smsService;

  public NotificationService() {
    this.emailService = new EmailService();
    this.smsService = new SMSService();
  }

  public void sendNotification(String message) {
    emailService.sendEmail(message);
    smsService.sendSMS(message);
  }
}
