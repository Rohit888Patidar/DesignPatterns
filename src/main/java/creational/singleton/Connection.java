package creational.singleton;

public class Connection {

    //static instance to be initialized into static method
    private static Connection connection;

    //Restrict the object creation for outside
    private Connection()
    {
    }

    //Provide the method to get the object
    //only return the same object every time
    public static Connection getInstance()
    {
        if(connection == null)
        {
            connection = new Connection();
        }
        return  connection;
    }

    //Provide the method to get the object for multithreaded environment
    //only return the same object every time
    //Problem: Without synchronization, multiple threads can enter the if condition
    //simultaneously when connection is null, creating multiple instances
    //that will break the singleton principle so using synchronized
    public static Connection getInstanceForMultiThreadedEnv() {

        if (connection == null) {
            synchronized (Connection.class) {
                if (connection == null)
                    connection = new Connection();
            }
        }
        return connection;
    }
}
