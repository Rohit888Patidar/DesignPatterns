package org.example.creational.factory.simple;

public class Main {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("springbootdeveloper");
        employee.getSalary();
        Employee employee1 = EmployeeFactory.getEmployee("webdeveloper");
        employee1.getSalary();


    }
}

