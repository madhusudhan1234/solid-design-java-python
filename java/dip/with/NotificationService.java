// NotificationService.java
import java.util.List;

public class NotificationService {
  private List<NotificationChannel> channels;

  public NotificationService(List<NotificationChannel> channels) {
    this.channels = channels;
  }

  public void sendNotification(String message) {
    for (NotificationChannel channel : channels) {
      channel.send(message);
    }
  }
}