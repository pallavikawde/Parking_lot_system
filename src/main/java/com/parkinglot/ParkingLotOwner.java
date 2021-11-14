package com.parkinglot;

public class ParkingLotOwner {
    private boolean isCapacityFull;

    public void capacityIsFull() {
        isCapacityFull = true;
    }

    public boolean isCapacityFull() {
        return this.isCapacityFull;
    }
}
