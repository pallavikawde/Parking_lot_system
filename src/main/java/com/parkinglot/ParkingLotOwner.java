package com.parkinglot;

public class ParkingLotOwner implements ParkingLotObserver {
    private boolean isCapacityFull;

    public void capacityIsFull() {
        isCapacityFull = true;
    }

    public boolean isCapacityFull() {
        return this.isCapacityFull;
    }
}
