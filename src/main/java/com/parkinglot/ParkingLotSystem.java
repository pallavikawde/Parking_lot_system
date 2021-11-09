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
    public void park(Object vehicle) throws ParkingLotException {
        if (this.vehicle != null)
            throw new ParkingLotException("parking lot is full");
        this.vehicle = vehicle;

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

    public boolean isVehicleparked(Object vehicle) {
        if (this.vehicle.equals(vehicle)) {
            return true;
        }
        return false;
    }
}
