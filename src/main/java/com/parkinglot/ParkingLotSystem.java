package com.parkinglot;

public class ParkingLotSystem {
    private Object vehicle;

    public ParkingLotSystem() {
    }

    /*******************************************************************
     * this methode is for parking a vehicle
     * @author pallavi
     * @since 9-11-21
     * @param vehicle
     * @return
     *****************************************************************/
    public boolean park(Object vehicle) {
        if(this.vehicle != null)
            return  false;
        this.vehicle = vehicle;
        return true;

    }

    /******************************************************************
     *  this methode for unparking a car
     * @author pallavi
     * @since 9-11-21
     * @param vehicle
     * @return
     *******************************************************************/
    public boolean unpark(Object vehicle) {
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        return false;
    }
}

