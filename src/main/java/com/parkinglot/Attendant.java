package com.parkinglot;

public class Attendant {

    ParkingLotSystem parkingLotSystem = new ParkingLotSystem();

    public void attendantPark(Vehicle vehicle, PersonType personType) throws ParkingLotSystemException {
        parkingLotSystem.park(vehicle, personType);
    }

    public void attendantUnPark(Vehicle vehicle) throws ParkingLotSystemException {
        parkingLotSystem.unPark(vehicle);
    }
}