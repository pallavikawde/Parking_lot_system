package com.parkinglot;

/***
 * Purpose : To operate as an observer by parking lot owner
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-10
 ******/
    public class ParkingLotSystemOwner implements Observer {
        private boolean isParkingLotFull;

    /***
     * Purpose : This method is created to set the status of full capacity of parking
     * ***/
    @Override
    public void ParkingLotCapacityFull() {
        isParkingLotFull = true;
    }
    /*
     * Purpose : This method is created to set the status of parking capacity available in the parking lot
     ****/
    @Override
    public void setParkingCapacityAvailable() {
        isParkingLotFull = false;
    }

    /****
     * Purpose : This method is created to get back the status of full capacity of parking lot
     *
     * @return the status of the parkin
     * ******/
    public boolean getParkingLotStatusIfCapacityFull() {
        return this.isParkingLotFull;
    }
}