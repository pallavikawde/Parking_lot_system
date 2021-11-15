package com.parkinglot;

/**
 * Purpose : To fix the setParkingLotCapacity() and
 * setParkingCapacityAvailable() method for parking lot system
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-13
 */
public interface Observer {
    void setParkingLotCapacity();

    void setParkingCapacityAvailable();
}
