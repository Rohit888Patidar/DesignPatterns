package org.example.creational.factory.factory_method.creator;

import org.example.creational.factory.factory_method.product.Notification;
import org.example.creational.factory.factory_method.product.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotificationObject() {
        return new SMSNotification();
    }
}
