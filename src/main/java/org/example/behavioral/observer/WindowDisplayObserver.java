package org.example.behavioral.observer;

public class WindowDisplayObserver implements Observer{
    ObservableImp observable;

    WindowDisplayObserver(ObservableImp observable)
    {
        this.observable = observable;
    }


    @Override
    public void update() {
        System.out.println(WindowDisplayObserver.class+ " Type Observer Updated with new temperature :" + this.observable.getTemp());
    }
}
