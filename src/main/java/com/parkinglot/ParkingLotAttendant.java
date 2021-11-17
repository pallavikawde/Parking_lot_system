package com.parkinglot;

/***********************************************************************************************************
 * Purpose : To check status of vehicle that vehicle is parked by attendant or not.
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-11
 ***************************************************************************************************************/
        public class ParkingLotAttendant {
            ParkingLotSystem parkingLotSystem = new ParkingLotSystem(3);

    /***
     * Purpose : This method is created to park the car by attendant in parking lot
     *
     * @param vehicle : is vehicle is parked by attendent or not
     * @throws ParkingLotSystemException : when the parking lot is full
     **/

    public void parkedByAttendant(Vehicle vehicle) throws ParkingLotSystemException {
        parkingLotSystem.park(vehicle);
    }

    /**
     * Purpose : This method is created to unpark the car by attendant in parking lot
     *
     * @param vehicle : Is vehicle unparked by Attendant or Not
     * @throws ParkingLotSystemException : when there is no vehicle to unpark
     **/

    public void unParkedByAttendant(Vehicle vehicle) throws ParkingLotSystemException {
        parkingLotSystem.unPark(vehicle);
    }
}