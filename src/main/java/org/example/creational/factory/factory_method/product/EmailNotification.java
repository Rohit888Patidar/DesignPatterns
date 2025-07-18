package org.example.creational.factory.factory_method.product;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Sending a Email noticgt  fication");
    }
}
