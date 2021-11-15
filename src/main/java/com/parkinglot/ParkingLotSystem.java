package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

/************************************************************************************************************
 * Purpose : To simulate parking lot system
 *
 * @author PALLAVI JAGTAP
 * @version '1.0-SNAPSHOT'
 * @since 2021-11-11
 ***********************************************************************************************************/
    public class ParkingLotSystem {
        private final int actualCapacity;
        private ParkingLotSystemOwner owner;
        private Vehicle vehicle;
        private static List<Vehicle> vehicles;
        private final List<Observer> observers;

    public ParkingLotSystem(int capacity) {
        this.actualCapacity = capacity;
        vehicles = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    /**********************************************************************************************************
     * Purpose : This method is created to print welcome message
     **********************************************************************************************************/
        public void printWelcomeMessage() {
            System.out.println("Welcome To The Parking Lot System...");
    }

    /*********************************************************************************************************
     * Purpose : This method is created to park the vehicle
     *
     * @param vehicle : takes vehicle as parameter
     * @throws ParkingLotSystemException : when the parking lot is full
     *************************************************************************************************************/
        public void park(Vehicle vehicle) throws ParkingLotSystemException {
            if (ParkingLotSystem.vehicles.size() == this.actualCapacity) {
                for (Observer observer : observers) {
                observer.setParkingLotCapacity();
            }
            throw new ParkingLotSystemException
                    (ParkingLotSystemException.ExceptionType.PARKING_LOT_IS_FULL, "Parking Lot is Full");
        }
        ParkingLotSystem.vehicles.add(vehicle);
    }

    /*********************************************************************************************************
     * Purpose : This method is created to unpark the vehicle
     *
     * @param vehicle : takes vehicle as parameter
     * @throws ParkingLotSystemException : when there is no vehicle to unpark
     *****************************************************************************************************/
        public void unPark(Vehicle vehicle) throws ParkingLotSystemException {
            if (this.vehicle == null) {
            throw new ParkingLotSystemException
                    (ParkingLotSystemException.ExceptionType.NO_SUCH_VEHICLE, "Vehicles can not be null");
        } else if (ParkingLotSystem.vehicles.contains(vehicle)) {
            ParkingLotSystem.vehicles = null;
            for (Observer observer : observers) {
                observer.setParkingCapacityAvailable();
            }
        }
    }

    /**********************************************************************************************************
     * Purpose : This method is created to check
     * the vehicle is parked or not
     *
     * @param vehicle : takes vehicle as parameter
     * @return the vehicle is parked
     ***************************************************************************************************************/
        public boolean isVehicleParked(Vehicle vehicle) {
            return ParkingLotSystem.vehicles.contains(vehicle);
    }

    /************************************************************************************************************
     * Purpose : This method is created to check
     * the vehicle is unparked or not
     *
     * @param vehicle : takes vehicle as parameter
     * @return the vehicle is unparked
    ************************************************************************************************************** */
        public boolean isVehicleUnParked(Vehicle vehicle) {
            return ParkingLotSystem.vehicles == null;
    }

    /********************************************************************************************************
     * Purpose : This method is created for checking whether the parking lot is full or not
     *
     * @return the checked value
     ********************************************************************************************************/
        public boolean isParkingLotFull() {
            return vehicles.size() == this.actualCapacity;
    }

    /************************************************************************************************************
     * Purpose : This method is created to add parking lot owner observer
     *
     * @param observer : takes the parking lot owner as parameter
    ************************************************************************************************************ */
        public void addObserver(Observer observer) {
            this.observers.add(observer);
    }

    /**********************************************************************************************************
     * Purpose : This method is created to get back the position of parked car
     *
     * @param vehicle : takes vehicle as parameter
     * @return the position of the vehicle if the vehicle is parked
     * @throws ParkingLotSystemException : when no vehicle is found
     *************************************************************************************************************/
        public int getVehiclePosition(Vehicle vehicle) throws ParkingLotSystemException {
            if (isVehicleParked(vehicle))
                for (Vehicle position : vehicles) {
                if (position.equals(vehicle))
                    return vehicles.indexOf(position);
            }
        throw new ParkingLotSystemException(ParkingLotSystemException.ExceptionType.NO_SUCH_VEHICLE,
                "No Such Vehicle Found");
    }

    /**********************************************************************************************************
     * Purpose : This method is created to get back the parking time of vehicle
     *
     * @param vehicle : takes vehicle as parameter
     * @return the parking time of the vehicle if the vehicle is parked
     * @throws ParkingLotSystemException : when no vehicle is found
     ********************************************************************************************************/
        public String getVehicleParkingTime(Vehicle vehicle) throws ParkingLotSystemException {
            if (isVehicleParked(vehicle)) {
                for (Vehicle parkingTimeForVehicle : vehicles) {
                    if (parkingTimeForVehicle.equals(vehicle))
                    return parkingTimeForVehicle.getParkingTime();
            }
        }
        throw new ParkingLotSystemException(ParkingLotSystemException.ExceptionType.NO_SUCH_VEHICLE,
                "No Such Vehicle Parked");
    }
}