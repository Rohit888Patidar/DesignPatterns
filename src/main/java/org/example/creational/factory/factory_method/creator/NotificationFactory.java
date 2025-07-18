package org.example.creational.factory.factory_method.creator;

import org.example.creational.factory.factory_method.product.Notification;

public interface NotificationFactory {
    public Notification createNotificationObject();
}
