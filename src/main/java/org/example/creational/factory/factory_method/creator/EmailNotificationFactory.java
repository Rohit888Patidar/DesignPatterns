package org.example.creational.factory.factory_method.creator;

import org.example.creational.factory.factory_method.product.EmailNotification;
import org.example.creational.factory.factory_method.product.Notification;

public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotificationObject() {
        return new EmailNotification();
    }
}
