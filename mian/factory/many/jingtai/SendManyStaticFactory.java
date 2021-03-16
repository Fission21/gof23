package factory.many.jingtai;

import factory.MailSender;
import factory.Sender;
import factory.SmsSender;

/**
 *  静态多方法工厂
 */
public class SendManyStaticFactory {
    
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
