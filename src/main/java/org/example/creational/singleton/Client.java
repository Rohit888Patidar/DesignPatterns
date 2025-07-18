package org.example.creational.singleton;

import java.lang.reflect.InvocationTargetException;

public class Client {

    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

        // Obtain singleton instances using the standard getInstance() method
        Connection connection = Connection.getInstance();
        Connection connection1 = Connection.getInstance();

        // Both hash codes should be the same, confirming the same instance is returned
        System.out.println(connection.hashCode());
        System.out.println(connection1.hashCode());

        /*
         * Ways to break the Singleton design pattern:
         * 1. Using Reflection API to invoke the private constructor
         * 2. Using Cloning to create a copy of the singleton instance
         * 3. (Not shown here) Using Serialization and Deserialization to create a new instance
         */

        // 1. Breaking Singleton using Reflection API
        /*
        Constructor<Connection> constructor = Connection.class.getDeclaredConstructor();
        constructor.setAccessible(true); // Bypass private access modifier
        Connection connection2 = constructor.newInstance(); // Create new instance
        System.out.println(connection2.hashCode()); // Different hash code, breaking singleton
        */

        // 2. Breaking Singleton using Cloning
        /*
        Connection connection3 = (Connection) connection.clone(); // Clone the singleton instance
        System.out.println(connection3.hashCode()); // Different hash code, breaking singleton
        */

        // Note: To fully protect the Singleton pattern, consider:
        // - Preventing reflection attacks by throwing exceptions in the constructor if instance exists
        // - Preventing cloning by overriding clone() to throw CloneNotSupportedException
        // - Handling serialization by implementing readResolve() method
    }
}
