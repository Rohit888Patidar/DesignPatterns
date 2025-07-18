package org.example.creational.factory.simple;

/**
 * Factory Pattern Implementation
 * This class acts as a factory that creates different types of Employee objects
 * without exposing the creation logic to the client.
 */
public class EmployeeFactory {

    /**
     * Factory method to get the appropriate Employee instance
     *
     * @param empType type of employee to create
     * @return concrete implementation of Employee interface
     * @throws RuntimeException if employee type is invalid
     */
    public static Employee getEmployee(String empType) {
        if ("springbootdeveloper".equalsIgnoreCase(empType.trim())) {
            return new SpringBootDeveloper();
        } else if ("webdeveloper".equalsIgnoreCase(empType.trim())) {
            return new WebDeveloper();
        } else {
            throw new RuntimeException("Employee type is not valid");
        }
    }
}

