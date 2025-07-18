package org.example.creational.factory.simple;

public class WebDeveloper implements Employee {

    @Override
    public int getSalary() {
        int salary = 30000;;
        System.out.println("Salary of a WebDeveloper "+ salary);
        return salary;
    }
}
