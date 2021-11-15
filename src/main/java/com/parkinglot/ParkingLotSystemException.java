package com.parkinglot;

/***************************************************************************************************************
 * Purpose : Exception class for parking lot system
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-11
 ***************************************************************************************************************/
    public class ParkingLotSystemException extends Exception {
        public ExceptionType exceptionType;

    public ParkingLotSystemException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }

    public enum ExceptionType {PARKING_LOT_IS_FULL, NO_SUCH_VEHICLE}
}