package com.parkinglot;


/**************************
 *  Purpose To Park Vehicles Through Attendant.
 *
 *  @author PALLAVI JAGTAP
 *  @version 1.0
 *  @since 10-11-2021
 **************************/
public class ParkingLotAttendant {
    ParkingLotApplication parkingLotApplication = new ParkingLotApplication();

    public void parkVehicle(String vehicleNumber, String vehicle, String vehicleColour, ParkingSlot.VehicleType vehicleType) throws ParkingLotException {
        parkingLotApplication.park(vehicleNumber, vehicle, vehicleColour, vehicleType);
    }
}
