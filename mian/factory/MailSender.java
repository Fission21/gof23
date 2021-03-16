package factory;

/**
 *  邮件发送
 */
public class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("mail message");
    }
} 