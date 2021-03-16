package factory;

/**
 *  单方法工厂
 */
public class SendFactory {
    
    public Sender produce(String type){
        if ("mail".equals(type)) {
            return new MailSender();
        } else if("sms".equals(type)){
            return new SmsSender();
        }
        return null;
    }
}
