package com.parkinglot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {
    ParkingLotSystem parkingLotSystem = null;
    Object vehicle = null;

    @BeforeEach
    public void setUp() {
        vehicle = new Object();
        parkingLotSystem = new ParkingLotSystem();
    }

    @Test
    public void givenVehicle_whenParked_shouldReturnTrue() {
        try {
            parkingLotSystem.park(vehicle);
           boolean isparked =  parkingLotSystem.isVehicleparked(vehicle);
           Assertions.assertTrue(isparked);
        } catch (ParkingLotException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenVehicle_whenUnparked_shouldReturnTrue() {
        try {
            parkingLotSystem.park(vehicle);
            boolean isUnparked = parkingLotSystem.unpark(vehicle);
            Assertions.assertTrue(isUnparked);
        } catch (ParkingLotException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenAVehicle_whenAlreadyPark_shouldNotBeAbleToPark_shouldReturnFalse() {
        try {
            parkingLotSystem.park(vehicle);
            parkingLotSystem.park(new Object());
        } catch (ParkingLotException e) {
            Assertions.assertEquals(e.getMessage(),"parking lot is full");
            e.printStackTrace();
        }

    }
}



