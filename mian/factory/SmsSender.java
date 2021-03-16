package factory;

/**
 *  短信发送
 */
public class SmsSender implements Sender{

    @Override
    public void Send() {
        System.out.println("sms message");
    }
} 