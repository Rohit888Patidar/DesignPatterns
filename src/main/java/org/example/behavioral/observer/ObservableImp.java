package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImp implements Observable{

    List<Observer> observerList = new ArrayList<>();
    int temp = 0;

    @Override
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList)
        {
            o.update();
        }

    }

    public int getTemp()
    {
        return temp;
    }
    public void changeInTemperature(int temp)
    {
        if(this.temp<temp)
        {
            this.temp=temp;
            notifyObservers();
        }
    }
}
