package com.parkinglot;

public class ParkingLotSystem {
    private int currentCapacity;
    private final int actualCapacity;
    private Object vehicle;
    private ParkingLotOwner parkingLotOwner;

    public ParkingLotSystem(int capacity) {
        this.currentCapacity = 0;
        this.actualCapacity = capacity;
    }

    public void park(Object vehicle) throws ParkingLotException {
        if (this.currentCapacity == actualCapacity) {
            parkingLotOwner.capacityIsFull();
            throw new ParkingLotException("parking lot is full");
        }
        this.currentCapacity++;
        this.vehicle = vehicle;
    }

    public boolean unPark(Object vehicle) {
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        return false;
    }

    public boolean isVehicleparked(Object vehicle) {
        return this.vehicle.equals(vehicle);
    }

    public void registerOwner(ParkingLotOwner parkingLotOwner) {
        this.parkingLotOwner = parkingLotOwner;

    }
}
