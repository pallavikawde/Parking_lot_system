package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSystem {
    // private int currentCapacity;
    private int actualCapacity;
    private final List vehicles;
    private ParkingLotOwner parkingLotOwner;

    public ParkingLotSystem(int capacity) {
        this.vehicles = new ArrayList();
        this.actualCapacity = capacity;
    }

    public void setCapacity(int Capacity) {
        this.actualCapacity = Capacity;
    }

    public void park(Object vehicle) throws ParkingLotException {
        if (this.vehicles.size() == this.actualCapacity) {
            parkingLotOwner.capacityIsFull();
            throw new ParkingLotException("parking lot is full");
        }
        if (isVehicleparked(vehicle))
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

    public boolean isVehicleparked(Object vehicle) {
        return this.vehicles.contains(vehicle);
    }

    public void registerOwner(ParkingLotOwner parkingLotOwner) {
        this.parkingLotOwner = parkingLotOwner;

    }

}
