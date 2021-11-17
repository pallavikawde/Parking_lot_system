package com.parkinglot;

import java.time.LocalTime;
/*****************************************************************************************************************
 * Purpose : creating vehicle properties
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-011
 *********************************************************************************************************************/
public class Vehicle {
    private String name;
    private String vehicleNumber;
    private String parkingTime;

    public Vehicle(String name, String vehicleNumber, String parkingTime) {
        this.name = name;
        this.vehicleNumber = vehicleNumber;
        this.parkingTime = parkingTime;
    }

    public String getName() {
        return name;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getParkingTime() {
        return parkingTime;
    }
}
