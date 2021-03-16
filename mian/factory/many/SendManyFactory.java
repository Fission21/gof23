package factory.many;

import factory.MailSender;
import factory.Sender;
import factory.SmsSender;

/**
 *  多方法工厂
 */
public class SendManyFactory {
    
    public Sender produceMail(){
        return new MailSender();
    }
    
    public Sender produceSms(){
        return new SmsSender();
    }
}
