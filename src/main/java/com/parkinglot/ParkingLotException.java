package com.parkinglot;


public class ParkingLotException extends Exception {

    ExceptionType exceptionType;

    public ParkingLotException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }

    public enum ExceptionType {PARKING_LOT_IS_FULL, NO_SUCH_VEHICLE, VEHICLE_ALREADY_PARKED}
}
