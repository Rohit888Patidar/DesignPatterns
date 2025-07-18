package org.example.creational.singleton;

public class Connection implements Cloneable {

    // Static variable to hold the single instance of Connection
    private static Connection connection;

    // Private constructor to prevent instantiation from outside the class
    private Connection() {
        /*
         * To prevent breaking the singleton pattern via reflection,
         * you can uncomment the following check:
         * if (connection != null) {
         *     throw new RuntimeException("Breaking the singleton pattern: instance already exists");
         * }
         */
    }

    /**
     * Returns the singleton instance of Connection.
     * If the instance does not exist, it creates one.
     * This method is not thread-safe.
     *
     * @return the single instance of Connection
     */
    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }

    /**
     * Returns the singleton instance of Connection in a thread-safe manner.
     * Uses double-checked locking to ensure only one instance is created
     * even when multiple threads access this method concurrently.
     *
     * @return the single instance of Connection
     */
    public static Connection getInstanceForMultiThreadedEnv() {
        if (connection == null) {
            synchronized (Connection.class) {
                if (connection == null) {
                    connection = new Connection();
                }
            }
        }
        return connection;
    }

    /**
     * Overrides the clone method.
     * Note: This allows cloning of the singleton instance,
     * which can break the singleton pattern.
     * To prevent this, you can override this method to throw CloneNotSupportedException.
     *
     * @return a clone of the Connection instance
     * @throws CloneNotSupportedException if cloning is not supported
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
