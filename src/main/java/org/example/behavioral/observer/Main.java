package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        ObservableImp observable = new ObservableImp();
        Observer observer1 = new PhoneDisplayObserver(observable);
        Observer observer2 = new WindowDisplayObserver(observable);
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.changeInTemperature(10);
    }
}
