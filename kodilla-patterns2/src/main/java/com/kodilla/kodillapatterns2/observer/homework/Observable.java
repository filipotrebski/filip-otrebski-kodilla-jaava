package com.kodilla.kodillapatterns2.observer.homework;

public interface Observable {
    void registerObservers(Observer observer);
    void notifyObservers();
    void removeObservers(Observer observer);
}
