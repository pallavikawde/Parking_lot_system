package com.parkinglot;

/**
 * Purpose: To Know Lot Owner When The Lot is full & Space Available.
 *
 * @author PALLAVI JAGTAP
 * @since 10/11/2021
 */
public class ParkingLotOwner {
    private boolean isCapacityFull;


    public void capacityIsFull() {
        isCapacityFull = true;
    }


    public void capacityIsAvailable() {
        isCapacityFull = false;
    }

    public boolean isCapacityFull() {
        return this.isCapacityFull;
    }
}
