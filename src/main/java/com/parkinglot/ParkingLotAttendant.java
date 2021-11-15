package com.parkinglot;

/**
 * Purpose : To simulate parking and unparking of vehicles by parking lot attendant
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-11
 */
public class ParkingLotAttendant {
    ParkingLotSystem parkingLotSystem = new ParkingLotSystem(3);

    /**
     * Purpose : This method is created to park the car by attendant in parking lot
     *
     * @param vehicle : takes vehicle as a parameter
     * @throws ParkingLotSystemException : when the parking lot is full
     */
    public void parkedByAttendant(Vehicle vehicle) throws ParkingLotSystemException {
        parkingLotSystem.park(vehicle);
    }

    /**
     * Purpose : This method is created to unpark the car by attendant in parking lot
     *
     * @param vehicle : takes vehicle as a parameter
     * @throws ParkingLotSystemException : when there is no vehicle to unpark
     */
    public void unparkedByAttendant(Vehicle vehicle) throws ParkingLotSystemException {
        parkingLotSystem.unPark(vehicle);
    }
}