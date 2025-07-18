package org.example.creational.factory.simple;

public class SpringBootDeveloper implements Employee{

    public int getSalary()
    {
        int salary = 20000;
        System.out.println("Salary of SpringBoot Developer " + salary);
        return salary;
    }
}
