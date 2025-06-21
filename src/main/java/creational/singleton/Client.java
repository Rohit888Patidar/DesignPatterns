package creational.singleton;

public class Client {

    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        Connection connection1 = Connection.getInstance();
        System.out.println(connection == connection1); // should be true since same object is being returned every time
    }
}
