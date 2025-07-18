package org.example.behavioral.command;

import org.springframework.stereotype.Component;

@Component
public class GenerateReportCommand implements TaskCommand{
    @Override
    public void execute() {
        System.out.println("generating a report");
    }
}
