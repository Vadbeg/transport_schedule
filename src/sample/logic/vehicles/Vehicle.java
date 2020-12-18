package sample.logic.vehicles;

import sample.logic.Route;

import java.util.LinkedList;


public abstract class Vehicle {

    String idNumber;
    int capacity;
    int passengersNumber;

    public abstract String getVehicleType();
    public abstract void drive();
    public abstract void stopOnBusStop();
    public abstract void setRoute(Route route);

    public abstract String addPassengers(LinkedList<Package> passengers);
    public abstract LinkedList<Package> releasePassengers();

    public abstract void waitNextTour();

    public abstract void changeCapacity(int newCapacity);
    public abstract String showRoute();

}
