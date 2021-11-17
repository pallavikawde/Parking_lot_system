package com.parkinglot;

/**********************************************************************************************************
 * Purpose : To operate as an observer by airport security staff
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-11
 *****************************************************************************************************************/
public class AirportSecurity implements Observer {
    private boolean isParkingLotFull;

    /**
     * Purpose : This method is created to set the status of full capacity of parking lot
     */
    @Override
    public void ParkingLotCapacityFull() {
        isParkingLotFull = true;
    }
    /**
     * Purpose : This method is created to set the status of parking capacity available in the parking lot
     */
    @Override
    public void setParkingCapacityAvailable() {
        isParkingLotFull = false;
    }

    /**
     * Purpose : This method is created to get back the status of full capacity of parking lot
     *
     * @return the status of the parking lot
     */
    public boolean getParkingLotStatusIfCapacityFull() {
        return this.isParkingLotFull;
    }
}