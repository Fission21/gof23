package factory.method;

import factory.Sender;
import factory.SmsSender;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
