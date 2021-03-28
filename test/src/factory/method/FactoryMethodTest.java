package src.factory.method;

import factory.Sender;
import factory.method.Provider;
import factory.method.SendMailFactory;

/**
 *  工厂方法模式
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
