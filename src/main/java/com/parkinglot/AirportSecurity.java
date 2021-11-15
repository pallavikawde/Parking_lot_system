package com.parkinglot;

public class AirportSecurity implements ParkingLotObserver {
    private boolean isCapacityFull;

    public void capacityIsFull() {
        isCapacityFull = true;
    }

    public boolean isCapacityFull() {
        return this.isCapacityFull;
    }
}
