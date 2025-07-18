package org.example.behavioral.command;

import org.springframework.stereotype.Component;

@Component
public class SendEmailCommand implements TaskCommand{
    @Override
    public void execute() {
        System.out.println("Sending an email");
    }
}
