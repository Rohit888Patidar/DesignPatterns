package org.example.behavioral.observer;

public class PhoneDisplayObserver implements Observer{

    ObservableImp observable;

    PhoneDisplayObserver(ObservableImp observable)
    {
        this.observable = observable;
    }


    @Override
    public void update() {
        System.out.println(PhoneDisplayObserver.class+ " Type Observer Updated with new temperature :" + this.observable.getTemp());
    }
}
