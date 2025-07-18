package org.example.creational.factory.factory_method.product;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Sending a text notification");
    }
}
