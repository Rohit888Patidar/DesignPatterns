package org.example.behavioral.command;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskInvoker invoker;
    private SendEmailCommand emailCommand;
    private GenerateReportCommand generateReportCommand;

    TaskController(TaskInvoker taskInvoker, SendEmailCommand sendEmailCommand, GenerateReportCommand generateReportCommand)
    {
        this.invoker = taskInvoker;
        this.emailCommand = sendEmailCommand;
        this.generateReportCommand = generateReportCommand;
    }

    @PostMapping("/email")
    public String queueEmail()
    {
        invoker.addCommand(emailCommand);
    return "Email queued";
    }

    @PostMapping("/report")
    public String queueReport()
    {
        invoker.addCommand(generateReportCommand);
        return "Report queued";
    }

    @GetMapping("/run")
    public String runAll()
    {
        invoker.runAllCommand();
        return "Commands executed";
    }


}
