package org.example.behavioral.command;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskInvoker {
    private List<TaskCommand> taskCommandList = new ArrayList<>();

    public void addCommand(TaskCommand command)
    {
        taskCommandList.add(command);
    }

    public void runAllCommand()
    {
        for(TaskCommand command: taskCommandList)
        {
            command.execute();
        }
        taskCommandList.clear();
    }
}
