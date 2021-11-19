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
    private String vehicleNumber;
    private String name;
    private String parkingTime;
    private VehicleType vehicleType;

    public enum VehicleType {
        SMALL,
        LARGE
    }

    public Vehicle(String vehicleNumber, String name, String parkingTime, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.name = name;
        this.parkingTime = parkingTime;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getName() {
        return name;
    }

    public String getParkingTime() {
        return parkingTime;
    }
}


