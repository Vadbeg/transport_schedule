package sample.logic.vehicles;

import sample.logic.Route;

import java.util.LinkedList;

public class Tram extends Vehicle{
    @Override
    public String getVehicleType() {
        return null;
    }

    @Override
    public void drive() {

    }

    @Override
    public void stopOnBusStop() {

    }

    @Override
    public void setRoute(Route route) {

    }

    @Override
    public String addPassengers(LinkedList<Package> passengers) {
        return null;
    }

    @Override
    public LinkedList<Package> releasePassengers() {
        return null;
    }

    @Override
    public void waitNextTour() {

    }

    @Override
    public void changeCapacity(int newCapacity) {

    }

    @Override
    public String showRoute() {
        return null;
    }
}
