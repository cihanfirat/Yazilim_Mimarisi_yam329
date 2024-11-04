public class NotificationService {
    public static void main(String[] args){
        NotificationFactory nfactory = new NotificationFactory();
        INotification notification=nfactory.createNotification("SMS");
        System.out.println(notification.toString());
        notification.notifyUser();
    }
}
