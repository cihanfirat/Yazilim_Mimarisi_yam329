public class NotificationFactory {
    public INotification createNotification(String Type){
        if(Type == "SMS"){
            return new SMSNotification();
        }else if(Type == "Email"){
            return new EmailNotification();
        }else if(Type == "Push"){
            return new PushNotification();
        }else{
            return null;
        }
    }
}
