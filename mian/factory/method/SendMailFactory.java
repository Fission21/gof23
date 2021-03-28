package factory.method;

import factory.MailSender;
import factory.Sender;
import factory.SmsSender;

/**
 *  工厂方法模式
 */
public class SendMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
