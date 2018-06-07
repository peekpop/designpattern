package com.factory;

import com.factory.factory.SimpleSendFactory;
import com.factory.service.Sender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 12:49 2018/6/7
 * @Description: 简单工厂模式测试类
 */
public class SimpleFactory {
    public static void main(String[] args) {
        SimpleSendFactory sendFactory = new SimpleSendFactory();
        Sender mail = sendFactory.produce("mail");
        mail.send();
        Sender sender = sendFactory.smsProduce();
        sender.send();
        //静态方法通过  类名.方法名  进行调用，不用创建实例
        Sender staticSender = SimpleSendFactory.mailSenderProduce();
        staticSender.send();
    }
}
