package org.example.creational.factory.factory_method;

import org.example.creational.factory.factory_method.creator.EmailNotificationFactory;
import org.example.creational.factory.factory_method.creator.NotificationFactory;
import org.example.creational.factory.factory_method.creator.SMSNotificationFactory;
import org.example.creational.factory.factory_method.product.Notification;

public class Client {

    public static void main(String[] args) {
        NotificationFactory factory;

        String type = "SMS";  // this could come from config, input, etc.

        if (type.equalsIgnoreCase("EMAIL")) {
            factory = new EmailNotificationFactory();
        } else if (type.equalsIgnoreCase("SMS")) {
            factory = new SMSNotificationFactory();
        } else {
            throw new IllegalArgumentException("Unknown Notification type");
        }

        Notification notification = factory.createNotificationObject();
        notification.sendNotification();  // OUTPUT: Sending an SMS Notification
    }
    }
