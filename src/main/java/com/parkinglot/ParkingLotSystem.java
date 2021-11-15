package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSystem {
    // private int currentCapacity;
    private int actualCapacity;
    private  List vehicles;
    private List<ParkingLotObserver> observers;


    public ParkingLotSystem(int capacity) {
        this.observers = new ArrayList<>();
        this.vehicles = new ArrayList();
        this.actualCapacity = capacity;
    }

    public void setCapacity(int Capacity) {
        this.actualCapacity = Capacity;
    }

    public void park(Object vehicle) throws ParkingLotException {
        if (this.vehicles.size() == this.actualCapacity) {
            for(ParkingLotObserver observer:observers){
                observer.capacityIsFull();
            }
            throw new ParkingLotException("parking lot is full");
        }
        if (isVehicleParked(vehicle))
            throw new ParkingLotException("vehicle Already parked");
        this.vehicles.add(vehicle);
    }

    public boolean unPark(Object vehicle) {
        if (this.vehicles.contains(vehicle)) {
            this.vehicles.remove(vehicle);
            return true;
        }
        return false;
    }

    public boolean isVehicleParked(Object vehicle) {
        return this.vehicles.contains(vehicle);
    }

    public void registerParkingLotObserver(ParkingLotObserver parkingLotObservers) {
     this.observers.add(parkingLotObservers);

    }

//    public void registerSecurity(AirportSecurity airportSecurity) {
//        this.security = airportSecurity;
//    }
}
