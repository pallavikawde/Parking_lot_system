package com.parkinglot;


/**
 * Purpose To Know Airport Security When The Lot is full & When Space Available.
 *
 * @author PALLAVI JAGTAP
 * @since 10/11/2021
 */
public class AirportSecurity {
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


